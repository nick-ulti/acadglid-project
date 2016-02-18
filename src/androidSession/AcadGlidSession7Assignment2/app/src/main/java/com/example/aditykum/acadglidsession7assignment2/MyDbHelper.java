package com.example.aditykum.acadglidsession7assignment2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aditykum on 2/18/2016.
 */
public class MyDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "testDb";
    private static final int DATABASE_version = 2;
    private static final String TABLE_NAME = "productName";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "Name";
    public MyDbHelper(Context ctx)
    {
        super(ctx,DATABASE_NAME,null,DATABASE_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        this.onCreate(db);
    }
    public void insertData(String name)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues ctv = new ContentValues();
        ctv.put(COL_2, name);
        db.insert(TABLE_NAME, null, ctv);

    }
    public ArrayList<String> getAllProduct()
    {
        ArrayList<String> str = new ArrayList<String>(); ;
        Cursor csr;
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        csr = db.rawQuery(query,null);
        if(csr.getCount()>0)
        {csr.moveToFirst();
            do{
                String str1 = csr.getString(1).toString();
                  str.add(str1);

            }while(csr.moveToNext());
        }
       return str;
    }
}
