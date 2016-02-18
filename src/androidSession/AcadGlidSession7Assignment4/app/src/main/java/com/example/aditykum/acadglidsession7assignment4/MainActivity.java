package com.example.aditykum.acadglidsession7assignment4;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameText;
    EditText surnameText;
    Button addButton;
    Button showallBtn;
    MyDataBasehelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        db = new MyDataBasehelper(this);
        nameText = (EditText)findViewById(R.id.nameText);
        surnameText = (EditText)findViewById(R.id.surnameText);
        addButton = (Button)findViewById(R.id.addBtn);
        showallBtn = (Button)findViewById(R.id.ShowBtn);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean b = db.insertdata(nameText.getText().toString(),
                        surnameText.getText().toString());
                if(b)
                    Toast.makeText(getApplicationContext(),"Data Inserted",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(),"Data Not Inserted",Toast.LENGTH_SHORT).show();


            }
        });
        showallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //call to show all data
                StringBuffer str = new  StringBuffer("");
                Cursor csr = db.getAllData();
                if(csr.getCount() > 0){
                    csr.moveToFirst();
                    do{
                        str.append("ID : " + csr.getString(0) +
                                " Name : " + csr.getString(1) +
                                " SurName : " + csr.getString(2) + "\n");
                    }while(csr.moveToNext());
                }
                Intent intent = new Intent(getApplicationContext(),DisplayActiviy.class);
                intent.putExtra("data",str.toString());
                startActivity(intent);


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
