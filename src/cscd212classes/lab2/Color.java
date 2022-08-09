package cscd212classes.lab2;

import cscd212Lib.lab2.HelpersMethods;

import java.util.ArrayList;

public class Color {

    private static ArrayList<Color> allColors;

    private final String name;

    private final short[] rgba;

    public Color(final String name, final short[] rgba) {

        if(name == null){
            throw new IllegalArgumentException();
        }
        if(name.length()==0){
            throw new IllegalArgumentException("The name is empty.");
        }
        if(rgba.length != 4){
            throw new IllegalArgumentException("length not 4");
        }
        for(short values : rgba){
            if(values > 255 || values < 0){
                throw new IllegalArgumentException("rgba values not between 0 and 255");
            }
        }
        this.name = name;

        this.rgba = new short[4];
        System.arraycopy(rgba, 0 , this.rgba, 0, rgba.length);
        if(allColors==null){
            allColors = new ArrayList<>();
        }

        allColors.add(this);

        // TODO: add code
    }

    public String getName() {
        return this.name;
         // TODO: add code
    }

    public short getRed() {
        return this.rgba[0]; // TODO: add code
    }

    public short getGreen() {
        return this.rgba[1]; // TODO: add code
    }

    public short getBlue() {
        return this.rgba[2]; // TODO: add code
    }

    public short getAlpha() {

        return rgba[3]; // TODO: add code
    }

    public static Color[] getAllColors() {
        Color[] color = new Color[allColors.size()];
        allColors.toArray(color);
        return color;// TODO: add code
    }
}
