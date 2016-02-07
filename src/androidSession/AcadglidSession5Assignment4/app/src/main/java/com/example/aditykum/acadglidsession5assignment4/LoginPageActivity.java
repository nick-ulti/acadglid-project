package com.example.aditykum.acadglidsession5assignment4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by aditykum on 2/7/2016.
 */
public class LoginPageActivity extends Activity {


        TextView mText;

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.loginlayout);
            mText = (TextView)findViewById(R.id.loginactivity);
            Intent intName = getIntent();
            String userName = intName.getStringExtra("UserId");

            mText.setText("Welcome "+userName+"!");



        }
    }

