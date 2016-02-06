package com.example.aditykum.acadglidsession3assignment1;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView m_textView;
    Button m_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        m_textView = (TextView)findViewById(R.id.idetext);
        m_button = (Button)findViewById(R.id.idbtn);
        m_textView.setBackgroundResource(R.drawable.ic_launcher);
        //m_textView.setCompoundDrawablesWithIntrinsicBounds(
         //       R.drawable.ic_launcher, 0, 0, 0);
        m_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = m_button.getText().toString();
                if(str.equals("Hide"))
                {
                    m_textView.setBackground(null);
                    m_button.setText("Show");

                }
                if(str.equals("Show"))
                {    m_textView.setBackgroundResource(R.drawable.ic_launcher);
                    m_button.setText("Hide");
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
