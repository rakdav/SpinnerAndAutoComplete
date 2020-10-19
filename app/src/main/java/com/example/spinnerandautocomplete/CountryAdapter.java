package com.example.spinnerandautocomplete;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryInfo> {
    private Context context;
    private ArrayList<CountryInfo> Data;
    public CountryAdapter(@NonNull Context context, int resource, ArrayList<CountryInfo> d) {
        super(context, resource);
        Data=d;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row=convertView;
        if(row==null){

        }
        return row;
    }
}
