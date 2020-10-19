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
    ArrayList<CountryInfo> data = null;

    public CountryAdapter(Activity context, int resource, ArrayList<CountryInfo> data) {
        super(context, resource, data);
        this.context = context;
        this.data = data;
    }

    @Override
    @NonNull
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, @NonNull ViewGroup parent) { // этот код выполняется, когда вы нажимаете на спиннер
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            row = inflater.inflate(R.layout.spinner_item, parent, false);
        }

        CountryInfo item = data.get(position);

        if (item != null) { // парсим данные с каждого объекта
            ImageView myFlag = (ImageView) row.findViewById(R.id.countryFlag);
            TextView myCountry = (TextView) row.findViewById(R.id.contryName);
            TextView myPopulatin = (TextView) row.findViewById(R.id.countryPopulation);
            if (myFlag != null) {
                myFlag.setBackground(context.getResources().getDrawable(item.getCountryFlag(), context.getTheme()));
            }
            if (myCountry != null)
                myCountry.setText(item.getCountryName());
            if (myPopulatin != null)
                myCountry.setText(Long.toString(item.getCountryPopulation()));
        }

        return row;
    }
}
