package com.fingus.PRTest;

import com.badlogic.gdx.Game;

public class RatGame extends Game {

    @Override
    public void create() {
        setScreen(new FirstScreen(this)); // Set the initial screen to the MainMenuScreen
    }
}
