package com.inception.savetheworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    private LinearLayout signupback;
    private Button create_acount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signupback = (LinearLayout)findViewById(R.id.signupback);
        create_acount = (Button) findViewById(R.id.sign_button);

        signupback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(SignUp.this, Login.class);
                startActivity(it);

            }
        });


        create_acount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it = new Intent(SignUp.this,  MainActivity.class);
                startActivity(it);
                //Remove activity
                finish();

            }
        });

    }
}
