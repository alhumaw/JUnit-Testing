package cscd212classes.lab2;

public class Pixel {

    private Color color;
    public Pixel(){

    }

    public boolean setColor(final Color cr) {
        this.color = cr;
        if(cr == null) {
            return false;
        }
        return true;
        }

    public Color resetColor() {
        Color a = this.color;
        this.color = null;
        return a;
    }

    public Color getColor() {

        return color;
    }
}
