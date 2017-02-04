package com.example.vyshalis.accelerometer;

/**
 * Created by vijisat on 04-02-2017.
 */
public class GameLayout {
    private GameActivity onGameEventsListener;

    public GameLayout(GameActivity gameActivity) {
    }

    public void setOnGameEventsListener(GameActivity onGameEventsListener) {
        this.onGameEventsListener = onGameEventsListener;
    }
}
