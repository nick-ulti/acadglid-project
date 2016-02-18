package com.example.aditykum.acadglidsession6assignment4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView m_listView;
    Context m_context;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        getSupportActionBar();
        String [] name = {"aditya","arjun","arnab","ankit","fadia"};
        String [] phone = {"12345","23456","34567","45678","56789"};
        m_context = this;
        adapter = new MyAdapter(m_context,R.layout.custom_listview_item,name,phone);
        m_listView = (ListView)findViewById(R.id.listViewId);
        m_listView.setAdapter(adapter);

        registerForContextMenu(m_listView);

        m_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView tv = (TextView) view.findViewById(R.id.nameId);
                Toast.makeText(getApplicationContext(),"Hi " + tv.getText().toString()+" long press for Context Menu", Toast.LENGTH_LONG).show();
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


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuinfo) {
        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Context Menu");
        inflater.inflate(R.menu.context_menu_item, menu);
        super.onCreateContextMenu(menu, v, menuinfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        int id = item.getItemId();
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int index = info.position;
        View view = info.targetView;
        TextView txtName = (TextView)view.findViewById(R.id.nameId);
        TextView txtPhone = (TextView)view.findViewById(R.id.phoneId);
        String name = txtName.getText().toString();
        String phone = txtPhone.getText().toString();
        switch(id){
            case R.id.call :
                String uri = "tel:" + phone ;
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
                break;
            case R.id.sms:
                //Intent smsIntent = new Intent();
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms", phone,name)));
                break;

        }
        return true;

    }
}
