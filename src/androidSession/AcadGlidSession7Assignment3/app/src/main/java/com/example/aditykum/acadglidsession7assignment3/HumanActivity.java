package com.example.aditykum.acadglidsession7assignment3;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aditykum on 2/19/2016.
 */
public class HumanActivity extends Activity {
    TextView name;
    TextView age;
    ImageView photo;
    MyDbHelper db;
    List<Human> myHuman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.human);
        name = (TextView)findViewById(R.id.nametxt);
        age = (TextView)findViewById(R.id.agetxt);
        photo = (ImageView)findViewById(R.id.imgid);
        db = new MyDbHelper(getApplicationContext());
        myHuman = db.getAlldata();
        Intent intent = getIntent();
        int id = intent.getIntExtra("human", -1);
        for(int i =0;i<myHuman.size();i++)
        {
            if(myHuman.get(i).getId()==id)
            {
                name.setText("Name : " + myHuman.get(i).getName());
                age.setText("Age : " + myHuman.get(i).getAge());
                Drawable image = new BitmapDrawable(BitmapFactory.decodeByteArray(myHuman.get(i).getImage(), 0, myHuman.get(i).getImage().length));
                photo.setBackground(image);
                break;
            }
        }

    }
}
