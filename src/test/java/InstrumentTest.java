import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Guitar guitar;
    Drums drums;

    @Before
    public void before() {
        guitar = new Guitar("Les Paul",250,6);
        drums = new Drums("Zinfandel", 1000, "Full Set");
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
//------------------------------------------DRUMS-------------------------------------
    @Test
    public void canDrumsGetName() {
        assertEquals("Zinfandel", drums.getManufacturer());
    }

    @Test
    public void canGetDrumsPrice() {
        assertEquals(1000, drums.getCostPrice());
    }

    @Test
    public void canGetKitSize() {
        assertEquals("Full Set", drums.getKitSize());
    }

    @Test
    public void canDrumsMakeNoise() {
        assertEquals("Bum-bum-da-boom", drums.play());
    }
}
