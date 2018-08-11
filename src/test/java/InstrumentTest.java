import Instruments.Drums;
import Instruments.Guitar;
import Interfaces.ISell;
import Inventory.DrumSticks;
import Inventory.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar;
    Drums drums;
    Shop shop;
    DrumSticks drumsticks;
    GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitar = new Guitar("Les Paul", 250, 6);
        drums = new Drums("Zinfandel", 1000, "Full Set");
        shop = new Shop();
        guitarStrings = new GuitarStrings("Wire Company", 10);
        drumsticks = new DrumSticks("Wire Cutter", 10);
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
        assertEquals(500, guitar.calculateMarkup(), 0);
    }

    //------------------------------------------DRUMS-------------------------------------
    @Test
    public void canDrumsGetName() {
        assertEquals("Zinfandel", drums.getManufacturer());
    }

    @Test
    public void canGetDrumsPrice() {
        int result = drums.calculateMarkup();
        assertEquals(2000, result, 0);
    }

    @Test
    public void canGetKitSize() {
        assertEquals("Full Set", drums.getKitSize());
    }

    @Test
    public void canDrumsMakeNoise() {
        assertEquals("Bum-bum-da-boom", drums.play());
    }

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
        for (ISell banana : shop.stock) {
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
    //TODO Why does instruments which implements ISell work
    //TODO but inventory which doesn't implement ISell also works???
    @Test
    public void removeInventoryStock() {
        shop.addStock(guitarStrings);
        shop.addStock(drumsticks);
        shop.addStock(guitarStrings);
        shop.addStock(drumsticks);
        shop.removeStock();
        for (ISell banana : shop.stock) {
            System.out.println(banana);
        }
        System.out.println();
        assertEquals(3, shop.stock.size());
    }
}