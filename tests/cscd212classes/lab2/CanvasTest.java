package cscd212classes.lab2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static cscd212classes.lab2.Color.getAllColors;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

class CanvasTest {
    @Test
    public void checkConstructorCanvasIAE(){
        short[] rgba = new short[4];
        Pixel p = new Pixel();
        Canvas[] a = new Canvas[2];

        assertThrows(IllegalArgumentException.class, ()-> a[0] = new Canvas(1,-1));
        assertThrows(IllegalArgumentException.class, ()-> a[0] = new Canvas(-1,-1));
        assertThrows(IllegalArgumentException.class, ()-> a[0] = new Canvas(0,0));
    }
    @Test
    public void checkMatchSetColor(){
        short[] rgba = new short[4];
        Color a = new Color("Red",rgba);
        Canvas c = new Canvas(2,4);
        assertTrue(c.setColor(0,0,a));
    }
    @Test
    public void checkIAESetColor(){
        short[] rgba = new short[4];
        Color c = new Color("a",rgba);
        Canvas a = new Canvas(2,2);

        assertThrows(IllegalArgumentException.class, () ->  a.setColor(-1,2,c));;

    }
    @Test
    public void checkReturnResColor(){
        short[] rgba = new short[4];
        Color a = new Color("a", rgba);
        Canvas c = new Canvas(2,2);
        Pixel p = new Pixel();
        c.setColor(0,0, a);
        assertEquals(a, c.resetColor(0,0));
    }
    @Test
    public void checkIAEResColor(){
        Canvas a = new Canvas(2,2);
        assertThrows(IllegalArgumentException.class, () ->  a.resetColor(-1,2));;

    }
    @Test
    public void checkReturnGetColorCanvas(){
        short[] rgba = new short[4];
        Color a = new Color("a", rgba);
        Canvas c = new Canvas(2,2);
        Pixel p = new Pixel();
        c.setColor(0,0,a);
        assertEquals(a, c.getColor(0,0));
    }
    @Test
    public void checkIAEGetColor(){
        Canvas a = new Canvas(2,2);
        assertThrows(IllegalArgumentException.class, () ->  a.getColor(-1,-2));;

    }

    @Test
    public void canvasConstructor(){
        assertAll(()->new Canvas(5,5));
    }



}