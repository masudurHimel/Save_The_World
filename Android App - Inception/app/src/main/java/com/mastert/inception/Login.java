package com.mastert.inception;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Login extends AppCompatActivity {


    private LinearLayout signinback;
    private Button login_acount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signinback = (LinearLayout)findViewById(R.id.signinback);
        login_acount = (Button) findViewById(R.id.login);

        signinback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login.this,SignUp.class);
                startActivity(it);
            }
        });

        login_acount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Login.this,Timeline.class);
                startActivity(it);

                //Remove activity
                finish();
            }
        });

    }
}
