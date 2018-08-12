import Instruments.Drums;
import Instruments.Guitar;
import Interfaces.IStockChange;
import Inventory.DrumSticks;
import Inventory.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar;
    Drums drums;
    Shop shop;
    DrumSticks drumSticks;
    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitar = new Guitar("Les Paul", 250, 6);
        drums = new Drums("Zinfandel", 1000, "Full Set");
        shop = new Shop();
        guitarStrings = new GuitarStrings("Wire Company", 10);
        drumSticks = new DrumSticks("Chicken", 10);


    }

    //-------------------------GUITAR---------------------------------------------
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

    @Test
    public void calculateMarkup() {
        assertEquals(250, guitar.calculateMarkup(), 0);
    }

    //------------------------------------------DRUMS-------------------------------------
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
    public void removeStock() {
        shop.addStock(guitar);
        shop.addStock(drums);
        shop.addStock(guitar);
        shop.removeStock();
        for (IStockChange banana : shop.stock) {
            System.out.println(banana);
        }
        System.out.println();
        assertEquals(2, shop.stock.size());
    }

    @Test
    public void testAddToStockInventoryItems() {
        shop.addStock(guitarStrings);
        assertEquals(1, shop.stock.size());
    }
    @Test
    public void removeInventoryStock() {
        shop.addStock(guitarStrings);
        shop.addStock(drumSticks);
        shop.addStock(guitar);
        shop.addStock(drums);
        shop.removeStock();
        for (IStockChange banana : shop.stock) {
            System.out.println(banana);
        }
        System.out.println();
        assertEquals(3, shop.stock.size());
    }

    @Test
    public void testCheckProfitOfStock(){
        shop.addStock(guitar);
        shop.addStock(drums);
        shop.addStock(guitarStrings);
        shop.addStock(drumSticks);
        shop.checkProfitOfStock();
    }
}