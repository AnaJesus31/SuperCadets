package org.academiadecodigo.powrangers;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Hitboxes {

    private int x, y;
    private int width, height;
    private Rectangle hitbox;


    public Hitboxes(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        hitbox = new Rectangle(x, y, width, height);
        hitbox.setColor(Color.BLACK);
        hitbox.draw();
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getWidth() {
        return x + width;
    }
    public int getHeight() {
        return y + height;
    }
}
