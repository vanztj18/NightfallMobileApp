package com.example.mobileappsfinalnightfall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.*;
import android.hardware.camera2.CameraManager;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    String username;

    EditText nameInput;

    TextView gameView2;
    TextView gameInfo;

    private Scene scene1 = null;
    private Scene scene2 = null;
    private Scene scene3 = null;
    public Scene scene4 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scene1 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.menuscene, this);
        scene2 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.usernamescene, this);
        scene3 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.gamescreen, this);
        scene4 = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.gamescreen2, this);

        gameInfo = findViewById(R.id.gameText3);
        gameView2 = findViewById(R.id.gameText2);

        scene1.enter();

        configureHelpButton();
    }

    public void onClick1(View view) {
        TransitionManager.go(scene2);
    }

    private void configureHelpButton() {
        Button helpButton = findViewById(R.id.helpButton);
        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, helpscreen.class));
            }
        });
    }

    public void onClick2(View view) {
        nameInput = findViewById(R.id.userNameInput);
        username = nameInput.getText().toString();
        TransitionManager.go(scene3);
    }

    public void showGameText(View view) {
        Transition fadeTransition = new Fade();
        TransitionManager.go(scene4, fadeTransition);


        /*gameView2.setTextSize(10);
        gameView2.setText("Rebooting...<<Welcome to the USS Nightfall, Commander. This is your in-ship AI-Assistant" +
                "Your ship has crashed on an unknown planet following a power plant and subesquent Jump Drive malfunction." +
                "Your first priority, Commander, should be survival, this ship can serve as a temporary shelter until you can find a way to get off this planet>>");
        gameInfo.setText("<<I have recieved transponder signals from suitable replacements for the vital parts of Nightfall, It is up to you which one to get first>>");*/
    }


    public void onClick3(View view) {
        startActivity(new Intent(MainActivity.this, mountains.class));
        finish();
    }

    public void exit(View view) {
        finish();
        moveTaskToBack(true);
    }
}




