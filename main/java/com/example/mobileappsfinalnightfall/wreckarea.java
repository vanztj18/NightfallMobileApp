package com.example.mobileappsfinalnightfall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class wreckarea extends AppCompatActivity {

    int Input = 0;

    int randomWithRange (int min, int max) { //Random Class
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    Button searchButton;
    Button leaveButton;
    Button tryButton;

    Scene scene1 = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wreckarea);

        scene1 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer4), R.layout.mountainarea, this);

        scene1.enter();
    }

    public void onClick11(View view) {
        startActivity(new Intent(wreckarea.this, mountains.class));
    }

    public void onClick12(View view) {
        thruster();
    }

    public void onClick13(View view) {
        TransitionManager.go(scene1);
    }

    private void thruster() {
        Input = randomWithRange(1,3);
        if (Input == 1) {
            gameover.endCondition = 2;
            startActivity(new Intent(wreckarea.this, gameover.class));
        }
        else {
            textView1 = findViewById(R.id.textView19);
            textView2 = findViewById(R.id.textView20);
            textView3 = findViewById(R.id.textView21);
            textView4 = findViewById(R.id.textView22);

            searchButton = findViewById(R.id.searchButton);
            leaveButton = findViewById(R.id.leaveButton3);
            tryButton = findViewById(R.id.tryButton);

            textView2.setVisibility(View.INVISIBLE);
            textView1.setVisibility(View.INVISIBLE);
            textView3.setVisibility(View.INVISIBLE);
            searchButton.setVisibility(View.INVISIBLE);
            leaveButton.setVisibility(View.INVISIBLE);

            tryButton.setVisibility(View.VISIBLE);
            textView4.setVisibility(View.VISIBLE);
        }
    }
}
