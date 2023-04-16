package org.academiadecodigo.powrangers;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Player {

    private Picture player;
    private Platforms[] platforms;


    private int col, row;
    private int width, height;
    private Game game;
    private boolean isEndReached = false;
    private Background background;

    public void setBackground(Background background) {
        this.background = background;
    }


    Boolean isJumping;
    Boolean isFalling;
    int stopjump;


    public Player(int col, int row, int width, int height, String filepath) {
        this.col = col;
        this.row = row;
        this.width = width;
        this.height = height;
        isJumping = false;
        isFalling = false;
        /*platforms = new Platforms[12];
        platforms[0] = new Platforms(10, 557, 384, 53, Game.FILEPATH + "floor2.png");
        platforms[1] = new Platforms(489, 557, 1081, 53, Game.FILEPATH + "floor1.png");
        platforms[2] = new Platforms(1691, 432, 119, 178, Game.FILEPATH + "block3.png");
        platforms[3] = new Platforms(1090, 475, 90, 93, Game.FILEPATH + "block1.png");
        platforms[4] = new Platforms(1481, 431, 90, 136, Game.FILEPATH + "block2.png");
        platforms[5] = new Platforms(1065, 307, 391, 29, Game.FILEPATH + "platform3.png");
        platforms[6] = new Platforms(170, 248, 92, 29, Game.FILEPATH + "platform1.png");
        platforms[7] = new Platforms(486, 331, 92, 29, Game.FILEPATH + "platform1.png");
        platforms[8] = new Platforms(1634, 300, 92, 29, Game.FILEPATH + "platform1.png");
        platforms[9] = new Platforms(925, 350, 92, 29, Game.FILEPATH + "platform2.png");
        platforms[10] = new Platforms(803, 405, 92, 29, Game.FILEPATH + "platform2.png");
        platforms[11] = new Platforms(684, 457, 92, 29, Game.FILEPATH + "platform2.png");*/
        player = new Picture(col, row, filepath);
        player.draw();
    }

    public Player(int col, int row, String filepath) {
        this.col = col;
        this.row = row;
        isJumping = false;
        isFalling = false;
        player = new Picture(col, row, filepath);
        player.draw();
    }

    public Player(int col, int row, int width, String filepath) {
        this.col = col;
        this.row = row;
        this.width = width;
        isJumping = false;
        isFalling = false;
        player = new Picture(col, row, filepath);
        player.draw();
    }

    public void deletePlayer() {
        player.delete();
    }

/*    public void moveRight(Integer units) {
        this.col += units;
        this.player.delete();
        this.player = new Picture(this.col, this.row, Game.FILEPATH + "telmoOkR.png");
        this.player.draw();
        this.player.translate(units, 0);
    }

    public void moveLeft(Integer units) {
        this.col -= units;
        this.player.delete();
        this.player = new Picture(this.col, this.row, Game.FILEPATH + "telmoOkL.png");
        this.player.draw();
        this.player.translate(-units, 0);
    }*/

    public void moveRight() {
        if (player.getX() < 1742) {
            //       (player.getX() + player.getWidth() < platforms[3].getX() - Grid.PADDING && player.getY() + player.getHeight() > platforms[3].getY())) {
            player.translate(5, 0);

            }
        }


    public void moveLeft() {
        if (player.getX() > 10) {
            player.translate(-5, 0);
        }
    }

    public void moveUp() {
        if (player.getY() > 10) {
            player.translate(0, -5);
        }
    }

    public void moveDown() {
        if (player.getY() < 525) {
            player.translate(0, 5);
        }
    }

    public void jumping() {

        if (isJumping) {
            return;
        }
        isJumping = true;
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int jumpDuration = 24; // adjust as needed
                int maxJumpHeight = 16; // adjust as needed
                int time = 3;
                while (time < jumpDuration) {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    int jumpHeight = maxJumpHeight * time / jumpDuration;
                    player.translate(0, -jumpHeight);
                    time += 1;
                }
                time = 2;
                while (time < jumpDuration) {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    int jumpHeight = maxJumpHeight - maxJumpHeight * time / jumpDuration;
                    player.translate(0, jumpHeight);
                    time += 1;
                }
                isJumping = false;
            }
        });
        thread.start();


        /*while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (isJumping && stopjump < 125) {
                player.translate(0, -1);
                stopjump += 1;

            }
            if (isFalling) {
                player.translate(0, 1);
                stopjump += 1;

            }
            if (stopjump == 125) {
                isJumping = false;
                isFalling = true;


            }
            if (stopjump == 250) {
                isFalling = false;
                stopjump = 0;
            }

        }*/

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setFalling(boolean falling) {
        isFalling = falling;
    }

    public void setJumping(Boolean jumping) {
        isJumping = jumping;
    }

    public void setEndReached(boolean endReached) {
        isEndReached = true;
    }

    public boolean isEndReached() {
        return isEndReached;
    }
}
