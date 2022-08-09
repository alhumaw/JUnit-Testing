package cscd212classes.lab2;

public class Canvas {

    private final Pixel[][] thePixels;

    public Canvas(final int numOfRows, final int numOfCols) {

        if(numOfRows <= 0 || numOfCols <= 0){
            throw new IllegalArgumentException("numOfRows or numOfCols < 0");
        }

        this.thePixels = new Pixel[numOfRows][numOfCols];
        for(int i = 0; i < numOfRows ; i++){
            for(int j = 0; j < numOfCols;j++){
                    this.thePixels[i][j] = new Pixel();
            }
        }

    }

    public boolean setColor(final int row, final int col, final Color color) {

        if(row < 0 || col < 0) {
            throw new IllegalArgumentException("row or col <= 0");
        }
        for(int i = 0; i < thePixels.length; i++){
            for(int j = 0; j<thePixels[i].length;j++){
                if(thePixels[i][j] == thePixels[row][col]){
                    thePixels[i][j].setColor(color);
                    return true;
                }
            }
        }
        return false;
    }

    public Object resetColor(final int row, final int col) {

        if(row < 0 || col < 0) {
            throw new IllegalArgumentException("row or col <= 0");
        }


        for (int i = 0; i < thePixels.length; i++) {
            for (int j = 0; j < thePixels[i].length; j++) {
                if (thePixels[i][j] == thePixels[row][col])
                   return thePixels[i][j].resetColor();
                
            }
        }
        return null;
    }

    public Color getColor(final int row, final int col) {

        if(row < 0 || col < 0){
            throw new IllegalArgumentException("row or col <= 0");
        }


        for (int i = 0; i < thePixels.length; i++) {
            for (int j = 0; j < thePixels[i].length; j++) {
                if (thePixels[i][j] == thePixels[row][col]) {
                    return thePixels[i][j].getColor();
                }
            }
        }
        return null;
    }
}
