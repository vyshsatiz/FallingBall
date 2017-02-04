package com.example.vyshalis.accelerometer;

/**
 * Created by vijisat on 04-02-2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class GameActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final GameLayout gameLayout = new GameLayout(this);
        gameLayout.setOnGameEventsListener(this);
        setContentView(gameLayout);

        final Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }

    private void setContentView(GameLayout gameLayout) {

        setContentView(gameLayout);
    }

    //@Override
    public void onGameEnd() {
        finish();
    }

   // @Override
    public void onGameScoreChanged() {
        // blank
    }

    
}