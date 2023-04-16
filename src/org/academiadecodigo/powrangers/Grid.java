package org.academiadecodigo.powrangers;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELLSIZE = 10;

    private Rectangle grid;
    private int cols;
    private int rows;

    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        grid = new Rectangle(PADDING, PADDING, cols * CELLSIZE, rows * CELLSIZE);
        grid.setColor(new Color(0, 0, 0));
        grid.draw();
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }
}
