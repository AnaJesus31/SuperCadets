package org.academiadecodigo.powrangers;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Background {

    private Picture background;

    private boolean isInitStarted = false;

    private boolean isGameStarted = false;

    private boolean isLevel1Started = false;

    private boolean isLevel2Started = false;

    public Background(String filepath) {
        background = new Picture(10, 10, filepath);
        background.draw();
    }

    public void deleteBackground() {
        background.delete();
        isInitStarted = true;
    }

    public void deleteLevel1() {
        background.delete();
        isLevel1Started = true;
    }


    public boolean isInitStarted() {
        return isInitStarted;
    }

    public boolean isLevel1Started() {
        return isLevel1Started;
    }

    public void setGameStarted(boolean gameStarted) {
        isGameStarted = gameStarted;
    }

    public void setLevel2Started(boolean level2Started) {
        isLevel2Started = level2Started;
    }
}
