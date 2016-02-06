package com.example.aditykum.acadglidsession3assignment4;

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
    Button m_button;
    EditText m_email;
    EditText m_password;
    String email = null;
    String pass = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_email = (EditText) findViewById(R.id.idEmail);
        m_password = (EditText)findViewById(R.id.idPassword);
        m_button = (Button)findViewById(R.id.btnLogin);
        m_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = m_email.getText().toString();
                pass = m_password.getText().toString();
                if(email != null && pass !=null )
                {
                    Toast.makeText(getApplicationContext(),"Welcome!",Toast.LENGTH_LONG).show();
                   // Toast.makeText(getApplicationContext(),"email : " + email,Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Not entered  the correct values",Toast.LENGTH_SHORT).show();
                }


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
