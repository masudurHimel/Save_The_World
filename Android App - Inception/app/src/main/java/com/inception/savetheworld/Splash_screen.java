package com.inception.savetheworld;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 3 seconds
                    sleep(2*1000);

                    Intent intent = new Intent(Splash_screen.this, SignMain.class);
                    startActivity(intent);

                    // After 3 seconds redirect to another intent

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();


    }
    @Override
    protected void onDestroy() {

        super.onDestroy();


    }
}
