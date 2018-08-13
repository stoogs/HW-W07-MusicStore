import Instruments.Drums;
import Instruments.Guitar;
import Instruments.InstrumentType;
import Interfaces.IStockChange;
import Inventory.DrumSticks;
import Inventory.GuitarStrings;
import Inventory.InventoryType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar;
    Drums drums;
    Shop shop, shop2;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.GUITAR,"Les Paul", 250, 6);
        drums = new Drums(InstrumentType.DRUMS,"Zinfandel", 1000, "Full Set");
        shop = new Shop();
        guitarStrings = new GuitarStrings(InventoryType.GUITARSTRINGS,"Wire Company", 10);
        drumSticks = new DrumSticks(InventoryType.DRUMSTICKS, "Chicken", 10);
        shop2 = new Shop();
    }

    public void seedShopStock() {
        shop.addStock(guitarStrings);
        shop.addStock(drumSticks);
        shop.addStock(guitar);
        shop.addStock(drums);
    }

    //-------------------------GUITAR---------------------------------------------

    @Test
    public void testEnumGuitar() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void testGuitarManufacturer() {
        assertEquals("Les Paul", guitar.getManufacturer());
    }

    @Test
    public void testGuitarNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void testCostPrice() {
        assertEquals(250, guitar.getCostPrice());
    }

    @Test
    public void guitarCanIPlay() {
        guitar.play();
        assertEquals("Drrriiinnnngggg", guitar.play());
    }

    @Test //Jimi Hendrix guitar
    public void calculateMarkup() {
        assertEquals(24750, guitar.calculateMarkup(), 0);
    }

    //------------------------------------------DRUMS-------------------------------------

    @Test
    public void testEnumDrums() {
        assertEquals(InstrumentType.DRUMS, drums.getType());
    }

    @Test
    public void canDrumsGetName() {
        assertEquals("Zinfandel", drums.getManufacturer());
    }

    @Test
    public void canGetDrumsPrice() {
        int result = drums.calculateMarkup();
        assertEquals(1000, result);
    }

    @Test
    public void canGetKitSize() {
        assertEquals("Full Set", drums.getKitSize());
    }

    @Test
    public void canDrumsMakeNoise() {
        assertEquals("Bum-bum-da-boom", drums.play());
    }

    //-------------------------GUITARSTRINGS---------------------------------------------
    @Test
    public void testGuitaStrinrManufacturer() {
        assertEquals("Wire Company", guitarStrings.getManufacturer());
    }

    @Test
    public void testGuitarStringNumberOfStrings() {
        assertEquals(10, guitarStrings.getCostPrice());
    }

    @Test
    public void testGuitarStringsCostPrice() {
        assertEquals(10, guitarStrings.getCostPrice());
    }

    @Test
    public void calculateGuitarStringsMarkup() {
        assertEquals(10, guitarStrings.calculateMarkup());
    }
   //-------------------------DRUMSTICKS------------------------------
   @Test
   public void testDrumSticksManufacturer() {
       assertEquals("Chicken", drumSticks.getManufacturer());
   }

    @Test
    public void testDrumSticksNumberOfStrings() {
        assertEquals(10, drumSticks.getCostPrice());
    }

    @Test
    public void testDrumSticksCostPrice() {
        assertEquals(10, drumSticks.getCostPrice());
    }

    @Test
    public void calculateDrumSticksMarkup() {
        assertEquals(10, drumSticks.calculateMarkup());
    }
    //-------------------------SHOP STOCK TESTS------------------------------
    @Test
    public void testStockLevel() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void testAddToStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.stock.size());
    }

    @Test
    public void testRemoveStock() {
        seedShopStock();
        shop.removeStock();
        for (IStockChange banana : shop.stock) {
            System.out.println(banana);
        }
        System.out.println();
        assertEquals(3, shop.stock.size());
    }

    @Test
    public void testAddToStockInventoryItems() {
        shop.addStock(guitarStrings);
        shop.addStock(drumSticks);
        assertEquals(2, shop.stock.size());
    }
    @Test
    public void removeInventoryStock() {
        seedShopStock();
        for (IStockChange banana : shop.stock) {
            System.out.println(banana);
        }
        System.out.println();
        assertEquals(4, shop.stock.size());

    }

    @Test
    public void testCheckProfitOfStock(){
        shop.addStock(guitar);
        shop.addStock(drums);
        shop.addStock(guitarStrings);
        shop.addStock(drumSticks);
        assertEquals(25770, shop.checkProfitOfStock());
    }

//    -------------------------------STOCK TESTS---------------------
//TODO NOT HAPPY THESE ARE NOT FUNCTIONS IN SHOP. TRIED REFACTOR BUT FAILED.
    @Test
    public void printShopStockByNumberGuitars() {
        seedShopStock();
        seedShopStock();
        seedShopStock();
        int numGuitars = Collections.frequency( shop.stock, guitar);
        int ng = shop.numberOf(InstrumentType.GUITAR);
        System.out.println(numGuitars);
        System.out.println(guitar.getType());
        assertEquals(3, numGuitars);
    }

    @Test
    public void printShopStockByNumberDrums() {
        seedShopStock();
        seedShopStock();
        seedShopStock();
        int numDrums =Collections.frequency( shop.stock, drums);
        System.out.println(numDrums);
        System.out.println((drums.getType()));
        assertEquals(3, numDrums);
    }

}