package cscd212classes.lab2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PixelTest {

    @Test
    public void returnTrueSetColor(){
        short[] rgba = new short[4];
        final Color cr = new Color("cr", rgba);
       Pixel p = new Pixel();
       assertTrue(p.setColor(cr));

    }
    @Test
    public void returnFalseSetColorNull(){
        short[] rgba = new short[4];
        final Color cr = null;
        Pixel p = new Pixel();
        assertFalse(p.setColor(cr));

    }
    @Test
    public void checkReturnResetColor(){
        short[] rgba = new short[4];
        Color a = new Color("a", rgba);
        Pixel p = new Pixel();

        p.setColor(a);

       assertEquals(a, p.resetColor());

    }
    @Test
    public void checkReturnGetColor(){
        short[] rgba = new short[4];
        Color a = new Color("a",rgba);
        Pixel p = new Pixel();

        p.setColor(a);

        assertEquals(a, p.getColor());
    }

    @Test
    public void createPixelConstructor(){

        assertAll(()->new Pixel());
    }


}