package org.academiadecodigo.powrangers;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Platforms {

    private Picture picture;
    private int x, y;
    private int width, height;

    public Platforms(int x, int y, int width, int height, String filepath) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        picture = new Picture(x, y, filepath);
        picture.draw();
    }

    public void deletePlatforms() {
        picture.delete();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
