package com.example.aditykum.acadglidsession7assignment4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by aditykum on 2/18/2016.
 */
public class DisplayActiviy extends Activity {
    TextView mtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String val = intent.getStringExtra("data");
        setContentView(R.layout.second_layout);
        mtxt = (TextView)findViewById(R.id.showEditId);
        mtxt.setText(val);
    }

}
