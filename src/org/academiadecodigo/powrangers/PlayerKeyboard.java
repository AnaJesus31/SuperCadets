package org.academiadecodigo.powrangers;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class PlayerKeyboard implements KeyboardHandler {

    private Player player;
    private Keyboard keyboard;
    private Background background;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setBackground(Background background) {
        this.background = background;
    }


    public void init() {
        keyboard = new Keyboard(this);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent jump = new KeyboardEvent();
        jump.setKey(KeyboardEvent.KEY_SPACE);
        jump.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent start = new KeyboardEvent();
        start.setKey(KeyboardEvent.KEY_ENTER);
        start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent change = new KeyboardEvent();
        change.setKey(KeyboardEvent.KEY_C);
        change.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent close = new KeyboardEvent();
        close.setKey(KeyboardEvent.KEY_ESC);
        close.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);


        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(left);
        keyboard.addEventListener(jump);
        keyboard.addEventListener(start);
        keyboard.addEventListener(change);
        keyboard.addEventListener(close);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                player.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                player.moveLeft();
                break;
            case KeyboardEvent.KEY_UP:
                player.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                player.moveDown();
                break;
            case KeyboardEvent.KEY_SPACE:
                player.jumping();
                break;
            case KeyboardEvent.KEY_ENTER:
                background.deleteBackground();
                player.deletePlayer();
                background.setGameStarted(true);
                break;
            case KeyboardEvent.KEY_C:
                background.deleteLevel1();
                player.deletePlayer();
                background.setLevel2Started(true);
                break;
            case KeyboardEvent.KEY_ESC:
                System.exit(0);

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
