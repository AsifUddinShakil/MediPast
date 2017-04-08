package com.example.mobileappdevelop.photos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 4/8/2017.
 */

public class GridAdapter extends BaseAdapter {

    private Context context;
    ArrayList<Imageinfo> list =new ArrayList<>();

    public GridAdapter(Context context, ArrayList<Imageinfo> list) {
        this.context = context;
        this.list = list;
    }

    public GridAdapter(){

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.image,viewGroup,false);
        ImageView image= (ImageView) view.findViewById(R.id.pimage);
        TextView Apdate= (TextView) view.findViewById(R.id.apdate);
        TextView drname = (TextView) view.findViewById(R.id.idrname);
        image.setImageResource(list.get(i).getImage());
        Apdate.setText(list.get(i).getDate());
        drname.setText((list.get(i).getDrname()));
        return view;
    }
}
