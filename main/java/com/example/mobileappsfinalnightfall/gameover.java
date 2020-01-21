package com.example.mobileappsfinalnightfall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import static java.lang.System.exit;

public class gameover extends AppCompatActivity {
    public static int endCondition = 0;
    Scene combatrun = null;
    Scene playerdead = null;
    Scene victory = null;
    Scene left = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameover);

        combatrun = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer5), R.layout.combatrun, this);
        playerdead = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer5), R.layout.playerdead, this);
        victory = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer5), R.layout.victory, this);
        left = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer5), R.layout.playerleft, this);

        gameoverChooser();
    }

    public void gameoverChooser() {
        if (endCondition == 1) {
            TransitionManager.go(left);
        }
        else if (endCondition == 2) {
            TransitionManager.go(victory);
        }
        else if (endCondition == 3) {
            TransitionManager.go(playerdead);
        }
        else if (endCondition == 4) {
            TransitionManager.go(combatrun);
        }

    }

    public void noButtonClick(View view) {
        startActivity((new Intent(gameover.this, MainActivity.class)));
    }

    public void yesButtonClick(View view) {
        startActivity(new Intent(gameover.this, wreckapproach.class));
    }

    public void yesButtonClick2(View view) {
        startActivity(new Intent(gameover.this, mountains.class));
    }

    public void menuButtonClick(View view) {
        startActivity(new Intent(gameover.this, MainActivity.class));
    }
}
