package com.example.mobileappsfinalnightfall;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.widget.*;
import android.content.*;

import android.os.Bundle;

public class helpscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpscreen);

        configureBackButton();
    }

    private void configureBackButton() {
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(helpscreen.this, MainActivity.class));
            }
        });
    }
}
