package cscd212classes.lab2;

import org.junit.Assert;
import org.junit.function.ThrowingRunnable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;



class ColorTest {

    @Test
    public void colorNullNameExceptionTest() {

        short[] rgba = new short[4];
        final Color[] color = new Color[1];
        assertThrows(IllegalArgumentException.class, () -> color[0] = new Color(null, rgba));

    }

    @Test
    public void colorEmptyNameExceptionTest() {

        short[] rgba = new short[4];
        final Color[] color = new Color[1];
        assertThrows(IllegalArgumentException.class, () -> color[0] = new Color("", rgba));

    }

    @Test
    public void checkGetNameTest(){
        short[] rgba = new short[4];
        Color red = new Color("Red", rgba);
        assertEquals("Red", red.getName());
    }


    @Test
    public void getAllColorsTest(){
        Color[] colorArr = new Color[3];
        short[] rgba = new short[4];
        Color red = new Color("Red", rgba);
        Color blue = new Color("Blue", rgba);
        Color green = new Color("Green", rgba);
        colorArr[0] = red;
        colorArr[1] = blue;
        colorArr[2] = green;
        assertArrayEquals(colorArr, Color.getAllColors());
    }

    @Test
    public void testGetRed(){
        short[] rgba = new short[4];
        rgba[0] = 50;
        Color redTest = new Color("Red", rgba);
        assertEquals(50, redTest.getRed());
    }

    @Test
    public void testRgbaLengthOf4Exception(){
        short[] rgba = new short[3];
        final Color[] color = new Color[1];
        assertThrows(IllegalArgumentException.class, ()-> color[0] = new Color("someColor", rgba));
    }

    @Test
    public void testGetGreen(){
        short[] rgba = new short[4];
        rgba[1] = 50;
        Color greenTest = new Color("Green",rgba);
        assertEquals(50,greenTest.getGreen());
    }

    @Test
    public void testGetBlue(){
        short[] rgba = new short[4];
        rgba[2] = 50;
        Color blueTest = new Color("Blue",rgba);
        assertEquals(50,blueTest.getBlue());
    }

    @Test
    public void testGetAlpha(){
        short[] rgba = new short[4];
        rgba[3] = 50;
        Color alphaTest = new Color("Alpha",rgba);
        assertEquals(50,alphaTest.getAlpha());
    }

    @Test
    public void colorConstructor(){
        short[] rgba = new short[4];
        assertAll(()->new Color("red",rgba));
    }




}