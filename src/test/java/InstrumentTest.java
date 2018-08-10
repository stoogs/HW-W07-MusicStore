import Instruments.Drums;
import Instruments.Guitar;
import Interfaces.ISell;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar;
    Drums drums;
    Shop shop;

    @Before
    public void before() {
        guitar = new Guitar("Les Paul",250,6);
        drums = new Drums("Zinfandel", 1000, "Full Set");
        shop = new Shop();
    }
//-------------------------GUITAR---------------------------------------------
    @Test
    public void testGuitarManufacturer() {
        assertEquals("Les Paul", guitar.getManufacturer());
    }

    @Test
    public void testGuitarNumberOfStrings() {
        assertEquals(6,guitar.getNumberOfStrings());
    }

    @Test
    public void testcostPrice() {
        assertEquals(250, guitar.getCostPrice());
    }

    @Test
    public void guitarCanIPlay() {
        guitar.play();
        assertEquals("Drrriiinnnngggg", guitar.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(325.0, guitar.calculateMarkup(),0);
    }

    //------------------------------------------DRUMS-------------------------------------
    @Test
    public void canDrumsGetName() {
        assertEquals("Zinfandel", drums.getManufacturer());
    }

    @Test
    public void canGetDrumsPrice() {
        double result = drums.calculateMarkup();
        assertEquals(1300, result, 0);
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
    public void testAddToStock(){
        shop.addToStock(guitar);
        assertEquals(1,shop.stock.size());
    }

    @Test
    public void removeStock() {
        shop.addToStock(guitar);
        shop.addToStock(drums);
        shop.addToStock(guitar);
        shop.removeStock();
        for (ISell item: shop.stock)
              {
                  System.out.println(item);

        }
        System.out.println();
        assertEquals(2,shop.stock.size());
    }

}
