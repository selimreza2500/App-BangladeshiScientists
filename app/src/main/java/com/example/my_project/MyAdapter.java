package com.example.my_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
    private String[] scientistsName;
    private String[] scientistsSpeciality;
    private int[] image;
    private Context context;

    public MyAdapter(String[] scientistsName, String[] scientistsSpeciality, int[] image, Context context) {
        this.scientistsName = scientistsName;
        this.scientistsSpeciality = scientistsSpeciality;
        this.image = image;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.single_item, null, false);
        }

        ImageView imageView = view.findViewById(R.id.singleImageId);
        imageView.setImageResource(image[position]);

        TextView textView = view.findViewById(R.id.singleNameId);
        textView.setText(scientistsName[position]);

        TextView textshow = view.findViewById(R.id.singleSpecialityId);
        textshow.setText(scientistsSpeciality[position]);

        return view;
    }
}
