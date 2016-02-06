package com.example.aditykum.acadglidsession4assignment2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by aditykum on 2/6/2016.
 */
public class CustomListItemLayout extends ArrayAdapter<String> {

    private LayoutInflater mInflater;

    private String[] mStringsName;
    private String[] mPhone;

    private int mViewResourceId;

    public CustomListItemLayout(Context ctx, int viewResourceId,
                               String[] strings, String[] phone) {
        super(ctx, viewResourceId, strings);

        mInflater = (LayoutInflater)ctx.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);

        mStringsName = strings;
        mPhone = phone;

        mViewResourceId = viewResourceId;
    }

    @Override
    public int getCount() {
        return mStringsName.length;
    }

    @Override
    public String getItem(int position) {
        return mStringsName[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        TextView nametv = (TextView)convertView.findViewById(R.id.text1id);
        nametv.setText(mStringsName[position]);


        TextView phonetv = (TextView)convertView.findViewById(R.id.text2id);
        phonetv.setText(mPhone[position]);

        return convertView;
    }
}


