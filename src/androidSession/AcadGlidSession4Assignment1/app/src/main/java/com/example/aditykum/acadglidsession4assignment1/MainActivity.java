package com.example.aditykum.acadglidsession4assignment1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button m_acenbtn;
    Button m_descbtn;
    ListView m_listview;
    ArrayAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        m_acenbtn = (Button)findViewById(R.id.btnAscending);
        m_descbtn = (Button)findViewById(R.id.btdDescending);
        m_listview=(ListView)findViewById(R.id.listId);
        final String [] myArr = {"tul" , "anuj" , "arjun" , "arnab" , "anand" , "aditya"};
        myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myArr);
        m_listview.setAdapter(myAdapter);
        //myAdapter.notifyDataSetChanged();
        m_acenbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] arrAs = myArr;
                Arrays.sort(arrAs);
                myAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1, arrAs);
                m_listview.setAdapter(myAdapter);
                myAdapter.notifyDataSetChanged();



            }
        });
        m_descbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] arrAs1 = myArr;
                Arrays.sort(arrAs1);
                String[] arrDes = reverseAll(arrAs1);
                myAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1, arrDes);
                m_listview.setAdapter(myAdapter);
                myAdapter.notifyDataSetChanged();

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
    public static String [] reverseAll(String [] originals) {
        String [] reversed = new String[originals.length];
        for (int i = 0; i < originals.length; ++i) {
            reversed[i] = originals[originals.length - i -1];
        }
        return reversed;
    }
}
