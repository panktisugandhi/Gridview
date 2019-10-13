package com.example.practical_10;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public ImageAdapter(Context c) {
        mContext = c;
    }
    public int getCount() {
        return mThumbIds.length;
    }
    public Object getItem(int position) { return null; }
    public long getItemId(int position) { return 0; }
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) { imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setPadding(8, 8, 8, 8); }
        else { imageView = (ImageView) convertView; }
        imageView.setImageResource(mThumbIds[position]);
        return imageView; }
    public Integer[] mThumbIds = {
            R.drawable.alpha, R.drawable.beta,
            R.drawable.cupcake, R.drawable.donut,
            R.drawable.eclair, R.drawable.froyo,
            R.drawable.gengare, R.drawable.honey,
            R.drawable.icecreamesend, R.drawable.jellybean,
            R.drawable.kitket, R.drawable.lollipop,
            R.drawable.marsh,R.drawable.nonut,
            R.drawable.oreo,R.drawable.pie};}