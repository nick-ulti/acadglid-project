package com.example.aditykum.acadglidsession7assignment3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   MyDbHelper db;
    List<Human> list ;
    ListView lstv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstv = (ListView)findViewById(R.id.list);
        db = new MyDbHelper(this);
        //first human
       int resId1 = R.drawable.ic_launcher;
        Human hmn1 = new Human(26,"Amit",convertIntResToByteArray(resId1));
        db.insertData(hmn1);
        //second human
        int resId2 = R.drawable.images;
        Human hmn2 = new Human(24,"Aditya",convertIntResToByteArray(resId2));
        db.insertData(hmn2);
        //third human
        int resId3 = R.drawable.image2;
        Human hmn3 = new Human(20,"Udit",convertIntResToByteArray(resId3));
        db.insertData(hmn3);
        //get all humans

        list = db.getAlldata();
        List<String> listname = new ArrayList<>();
        for(int i=0;i<list.size();i++)
            listname.add(i,list.get(i).getName());
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,R.layout.row_layout,R.id.listText,listname);
        lstv.setAdapter(myAdapter);//
        lstv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), HumanActivity.class);
                intent.putExtra("human", list.get(position).getId());
                startActivity(intent);
            }
        });


    }

     public byte[] convertIntResToByteArray(int resId)
     {   byte[] photo=null;
             ByteArrayOutputStream baos = new ByteArrayOutputStream();
             Bitmap bitmap = ((BitmapDrawable) getResources().getDrawable(resId)).getBitmap();
             bitmap.compress(Bitmap.CompressFormat.PNG, 100, baos);
             photo = baos.toByteArray();

         return photo;
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
