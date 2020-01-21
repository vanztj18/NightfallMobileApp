package com.example.mobileappsfinalnightfall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;

public class wreckapproach extends AppCompatActivity {

    private static int combatInput = 0;


    Scene scene1 = null;
    Scene alienattack = null;
    Scene aliensneak = null;
    Scene aliendead  = null;
    Scene sneakdistract = null;

    int randomWithRange (int min, int max) { //Random Class
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wreckapproach);

        scene1 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer3), R.layout.mountainapproach, this);
        alienattack  = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer3), R.layout.alienattack, this);
        aliensneak = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer3), R.layout.aliensneak, this);
        aliendead = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer3), R.layout.aliendead, this);
        sneakdistract = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer3), R.layout.sneakdistract, this);

        scene1.enter();

    }

            public void onClick8(View view) {
                TransitionManager.go(alienattack);
            }

            public void shootGun(View view) {
                combatChooser();
            }

            public void runAway(View view) {
                gameover.endCondition = 4;
                startActivity(new Intent(wreckapproach.this, gameover.class));
                finish();
            }

            public void onClick9(View view) {
                TransitionManager.go(aliensneak);
            }


            public void onClick10(View view) {
                startActivity(new Intent(wreckapproach.this, mountains.class));
            }

            private void combatChooser() {
                combatInput = randomWithRange(1,2);
                if (combatInput == 1) {
                    TransitionManager.go(aliendead);
                }
                if (combatInput == 2) {
                    gameover.endCondition = 3;
                    startActivity(new Intent(wreckapproach.this, gameover.class));
                }
            }

            public void gotoVictory(View view) {
                gameover.endCondition = 2;
                startActivity(new Intent(wreckapproach.this, gameover.class));
            }

            public void distract (View view) {
                TransitionManager.go(sneakdistract);
            }

    public void leave2(View view) {
        gameover.endCondition = 1;
        startActivity(new Intent(wreckapproach.this, gameover.class));
    }
    public void lookAround(View view){
        startActivity(new Intent(wreckapproach.this, wreckarea.class));
    }

}
