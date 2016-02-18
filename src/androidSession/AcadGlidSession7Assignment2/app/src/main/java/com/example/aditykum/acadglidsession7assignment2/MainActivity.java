package com.example.aditykum.acadglidsession7assignment2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    MyDbHelper db;
    AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        db = new MyDbHelper(this);
        db.insertData("Camera");
        db.insertData("mobile");
        db.insertData("laptop");
        db.insertData("phonecall");
        db.insertData("pictures");
        db.insertData("potato");
        db.insertData("tomato");
        db.insertData("ballon");
        db.insertData("milk");
        db.insertData("chocolate");
        db.insertData("apple");
        db.insertData("ambrella");
        db.insertData("aeroplane");
        db.insertData("bald");
        actv = (AutoCompleteTextView)findViewById(R.id.autoTxt);
        ArrayList<String> mystr = new ArrayList<String>();
       //String [] mystr;
        mystr = db.getAllProduct();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, mystr);
        actv.setAdapter(adapter);




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
