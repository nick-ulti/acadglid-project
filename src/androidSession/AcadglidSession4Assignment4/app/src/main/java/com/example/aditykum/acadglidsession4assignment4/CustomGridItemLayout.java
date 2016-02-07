package com.example.aditykum.acadglidsession4assignment4;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridItemLayout extends ArrayAdapter<String> {
private LayoutInflater mInflater;

private String[] imageame;
private int[] images;

    private int mViewResourceId;
public CustomGridItemLayout(Context ctx, int viewResourceId,
        String[] imgname, int[] img) {
        super(ctx, viewResourceId, imgname);

        mInflater = (LayoutInflater)ctx.getSystemService(
        Context.LAYOUT_INFLATER_SERVICE);

    imageame = imgname;
    images = img;

        mViewResourceId = viewResourceId;
        }

@Override
public int getCount() {
        return imageame.length;
        }

@Override
public String getItem(int position) {
        return imageame[position];
        }

@Override
public long getItemId(int position) {
        return 0;
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        ImageView imv = (ImageView)convertView.findViewById(R.id.imageid);
        imv.setBackgroundResource(images[position]);

        TextView nametv = (TextView)convertView.findViewById(R.id.text2id);
        nametv.setText(imageame[position]);


        return convertView;
        }
        }



