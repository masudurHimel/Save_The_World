package com.mastert.inception;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 3 seconds
                    sleep(3*1000);

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
