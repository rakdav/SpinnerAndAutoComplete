package com.example.spinnerandautocomplete;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryInfo> {
    private Activity context;
    private ArrayList<CountryInfo> Data;
    public CountryAdapter(@NonNull Activity context, int resource, ArrayList<CountryInfo> d) {
        super(context, resource);
        this.context=context;
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
            LayoutInflater inflater=context.getLayoutInflater();
            row=inflater.inflate(R.layout.spinner_item,parent,false);
        }
        CountryInfo item=Data.get(position);
        if(item!=null)
        {
            ImageView myFlag=row.findViewById(R.id.countryFlag);
            TextView myCountry=row.findViewById(R.id.contryName);
            TextView myPopulation=row.findViewById(R.id.countryPopulation);
            myFlag.setBackground(context.getResources().getDrawable(item.getCountryFlag()));
            myCountry.setText(item.getCountryName());
            myPopulation.setText(Long.toString(item.getCountryPopulation()));
        }
        return row;
    }
}
