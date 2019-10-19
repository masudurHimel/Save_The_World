package com.inception.savetheworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignMain extends AppCompatActivity {

        private TextView signin;
        private LinearLayout get;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sign_main);

            get = (LinearLayout) findViewById(R.id.get);
            signin = (TextView) findViewById(R.id.signin);

            get.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent it = new Intent(SignMain.this, SignUp.class);
                    startActivity(it);

                }
            });

            signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent it = new Intent(SignMain.this, Login.class);
                    startActivity(it);
                    //Remove activity
                    finish();
                }
            });

        }
    }
