package com.example.aditykum.acadglidsession3assignment2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button m_violet;
    Button m_indigo;
    Button m_blue;
    Button m_green;
    Button m_yellow;
    Button m_orange;
    Button m_red;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        m_violet = (Button)findViewById(R.id.btnViolet);
        m_indigo = (Button)findViewById(R.id.btnIndigo);
        m_blue = (Button)findViewById(R.id.btnBlue);
        m_green = (Button)findViewById(R.id.btnGreen);
        m_yellow = (Button)findViewById(R.id.btnYellow);
        m_orange = (Button)findViewById(R.id.btnOrange);
        m_red = (Button)findViewById(R.id.btnRed);
        m_violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Violet Button Pressed",Toast.LENGTH_SHORT).show();
                Log.d("Aditya:","Violet Button pressed");
            }
        });
        m_indigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Indigo Button Pressed",Toast.LENGTH_SHORT).show();
                Log.d("Aditya:","Indigo Button pressed");
            }
        });

        m_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Blue Button Pressed",Toast.LENGTH_SHORT).show();
                Log.d("Aditya:","Blue Button pressed");
            }
        });

        m_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Green Button Pressed",Toast.LENGTH_SHORT).show();
                Log.d("Aditya:","Green Button pressed");
            }
        });

        m_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Yellow Button Pressed",Toast.LENGTH_SHORT).show();
                Log.d("Aditya:","Yellow Button pressed");
            }
        });

        m_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Orange Button Pressed", Toast.LENGTH_SHORT).show();
                Log.d("Aditya:", "Orange Button pressed");
            }
        });

        m_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Red Button Pressed",Toast.LENGTH_SHORT).show();
                Log.d("Aditya:","Red Button pressed");
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
