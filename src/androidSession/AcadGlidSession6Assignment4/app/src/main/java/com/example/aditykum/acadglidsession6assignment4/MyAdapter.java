package com.example.aditykum.acadglidsession6assignment4;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by aditykum on 2/9/2016.
 */
public class MyAdapter extends ArrayAdapter {
   LayoutInflater m_inflater;
    String[] actual_name;
    String[] actual_phone;
    int viewResourrceId;

    public MyAdapter(Context ctx,int resr,String[] name, String[] phone)
    {
        super(ctx,resr,name);
        m_inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        actual_name = name;
        actual_phone = phone;
        viewResourrceId = resr;

    }
    @Override
    public int getCount() {
        return actual_name.length;
    }

    @Override
    public String getItem(int position) {
        return actual_name[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = m_inflater.inflate(viewResourrceId,null);
        TextView txtname = (TextView)convertView.findViewById(R.id.nameId);
        txtname.setText(actual_name[position]);
        TextView txtPhone = (TextView)convertView.findViewById(R.id.phoneId);
        txtPhone.setText(actual_phone[position]);
        return convertView;


    }


}
