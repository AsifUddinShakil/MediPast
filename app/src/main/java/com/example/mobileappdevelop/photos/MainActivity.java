package com.example.mobileappdevelop.photos;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Imageinfo> list=new ArrayList<>();
    GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView= (GridView) findViewById(R.id.gridview);
        adapter = new GridAdapter(this,list);
        gridView.setAdapter(adapter);
        setdata();
    }

    public void setdata(){
        for(int i=1;i<10;i++)
        {
            Imageinfo img = new Imageinfo(R.mipmap.ic_launcher,"Asif","12/2/19");
            list.add(img);
        }
        adapter.notifyDataSetChanged();
    }
}
