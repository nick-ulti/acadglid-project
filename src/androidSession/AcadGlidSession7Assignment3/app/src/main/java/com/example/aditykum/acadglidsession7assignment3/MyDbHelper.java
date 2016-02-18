package com.example.aditykum.acadglidsession7assignment3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.Blob;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by aditykum on 2/18/2016.
 */
public class MyDbHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "otherdb";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "imageTable";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "Name";
    private static final String COL_3 = "Age";
    private static final String COL_4 = "Image";


    public MyDbHelper(Context ctx)
    {
        super(ctx,DB_NAME,null,DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "Create Table "+TABLE_NAME+" (ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,Age INTEGER,Image BLOB)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE imageTable IF EXISTS");
        this.onCreate(db);

    }

    public void insertData(Human hmn)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cnt = new ContentValues();
        cnt.put(COL_2,hmn.getAge());
        cnt.put(COL_3,hmn.getName());
        cnt.put(COL_4,hmn.getImage());
        db.insert(TABLE_NAME, null, cnt);
        db.close();

    }

    public List<Human> getAlldata()
    { List<Human> list = new LinkedList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM imageTable";
        Cursor csr = db.rawQuery(query,null);
        if(csr.getCount()>0)
        {
            csr.moveToFirst();
            do{
                Human hn = new Human();
                hn.setId(csr.getInt(0));
                hn.setAge(csr.getInt(1));
                hn.setName(csr.getString(2));
                hn.setImage(csr.getBlob(3));
                list.add(hn);

            }while(csr.moveToNext());
        }
        return list;

    }


}
