package com.example.mobileappsfinalnightfall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import android.view.View;

public class mountains extends AppCompatActivity {

    private Scene scene1 = null;
    private Scene scene2 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountains);

        scene1 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer2), R.layout.mountainscene1, this);
        scene2 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer2), R.layout.mountainscene2, this);

        scene1.enter();
    }




            public void onClick4(View view) {
                TransitionManager.go(scene2);
            }




            public void onClick5(View view) {
                gameover.endCondition = 1;
                startActivity(new Intent(mountains.this, gameover.class));
            }


            public void onClick6(View view) {
                startActivity(new Intent(mountains.this, wreckapproach.class));
            }

            public void onClick7(View view) {
             startActivity(new Intent(mountains.this, wreckarea.class));
          }
}
