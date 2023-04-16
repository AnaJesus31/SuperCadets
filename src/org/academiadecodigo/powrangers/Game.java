package org.academiadecodigo.powrangers;

import jdk.swing.interop.SwingInterOpUtils;

public class Game {
    public static final String prefix = ("");
    private Grid grid;
    private Player player;
    private Platforms[] platforms;
    Sound sound = new Sound();

    public void init() {
        Background startBg = new Background(prefix + "fundoStart.png");
        PlayerKeyboard playerKeyboardStart = new PlayerKeyboard();
        playerKeyboardStart.init();
        sound.playMusic(0);
        Player startPlayer = new Player(30, 525, prefix + "rato.png");
        playerKeyboardStart.setPlayer(startPlayer);
        playerKeyboardStart.setBackground(startBg);

        while (!startBg.isInitStarted()) {
            System.out.println("START");
            if (startBg.isInitStarted()) {
                break;
            }
        }
        sound.stopMusic();
        startGame(180, 60);
    }


    public void startGame(int cols, int rows) {
        Grid grid = new Grid(180, 60);
        Background background = new Background(prefix + "cenario1 final.png");
        Player player = new Player(100, 475, 58, 83, prefix + "telmo_R_final.png");
        PlayerKeyboard playerKeyboard = new PlayerKeyboard();
        playerKeyboard.setBackground(background);
        playerKeyboard.setPlayer(player);
        playerKeyboard.init();
        sound.playMusic(1);
        //player.jumping();


        while (!background.isLevel1Started()) {
            System.out.println("LEVEL 1");
            if (background.isLevel1Started()) {
                break;
            }
        }
        sound.stopMusic();
        secondLevel(180, 60);
    }

    public void secondLevel(int cols, int rows) {
        Grid grid1 = new Grid(180, 60);
        Background background2 = new Background(prefix + "cenario2 final.png");
        Player player2 = new Player(10, 475, 58,83, prefix + "silvia R final.png");
        PlayerKeyboard playerKeyboard2 = new PlayerKeyboard();
        playerKeyboard2.setBackground(background2);
        playerKeyboard2.setPlayer(player2);
        playerKeyboard2.init();
        sound.playMusic(2);
        //player2.jumping();

        while (!background2.isLevel1Started()) {
            System.out.println("LEVEL 2");
            if (background2.isLevel1Started()) {
                break;
            }
        }
        sound.stopMusic();
        end(180, 60);

    }

    public void end(int cols, int rows) {
        Grid grid2 = new Grid(180, 60);
        Background end = new Background(prefix + "finalgame.png");
        Player ratoFinal = new Player(30, 525, prefix + "rato.png");
        PlayerKeyboard playerKeyboard3 = new PlayerKeyboard();
        playerKeyboard3.setBackground(end);
        playerKeyboard3.setPlayer(ratoFinal);
        playerKeyboard3.init();
        sound.playMusic(3);
    }
}

/*
        return (player.getRow() < platforms[5].getY() + platforms[5].getHeight() && player.getRow() > platforms[5].getY() + platforms[5].getHeight()
                && player.getRow() + player.getHeight() < platforms[5].getY() && direction == Direction.UP) ||
                (player.getRow() + player.getHeight() > platforms[5].getY() && direction == Direction.DOWN) ||
                (player.getCol() + player.getWidth() > platforms[5].getX() && direction == Direction.RIGHT) ||
                (player.getCol() - player.getWidth() > platforms[5].getX() + platforms[5].getWidth() && direction == Direction.LEFT);
    }*/
