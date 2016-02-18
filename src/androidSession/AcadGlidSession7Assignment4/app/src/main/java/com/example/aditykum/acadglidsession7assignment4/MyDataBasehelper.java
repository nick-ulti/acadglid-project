package com.example.aditykum.acadglidsession7assignment4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by aditykum on 2/18/2016.
 */
public class MyDataBasehelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "testDb";
    private static final int DATABASE_version = 2;
    private static final String TABLE_NAME = "nameTable";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "Name";
    private static final String COL_3 = "SurName";
    public MyDataBasehelper(Context contxt){
        super(contxt,DATABASE_NAME,null,DATABASE_version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,SurName TEXT)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //drop  table if already exists
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        this.onCreate(db);

    }

    public boolean insertdata(String nem , String srnem)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cntv = new ContentValues();
        cntv.put(COL_2,nem);
        cntv.put(COL_3, srnem);
        long l = db.insert(TABLE_NAME,null,cntv);
        db.close();
        if(l!=-1)
            return true;
        else
           return false;


    }

    public Cursor getAllData()
    {
        Cursor csr;
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM " + TABLE_NAME;
        csr = db.rawQuery(query,null);
        return csr;
    }

}
