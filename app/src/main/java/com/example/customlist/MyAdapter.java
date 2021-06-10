package com.example.customlist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter  extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] data;

    public MyAdapter(Activity context, String[] data) {
        super(context, R.layout.customlist, data);
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.customlist, null, true);
        TextView txtTitle =  rowView.findViewById(R.id.tv);
        txtTitle.setText(data[position]);


        return  rowView;
    }
}