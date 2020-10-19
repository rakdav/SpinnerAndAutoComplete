package com.example.spinnerandautocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String[] cities={"Moscow","New York","Paris","Berlin"};
        Spinner spinner=findViewById(R.id.SpinnerCustom);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cities);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);
        ArrayList<CountryInfo> list=new ArrayList<>();
        list.add(new CountryInfo(R.drawable.gb,4500000,"Great Britain"));
        list.add(new CountryInfo(R.drawable.russia,14500000,"Russia"));
        list.add(new CountryInfo(R.drawable.germany,1500000,"German"));
        CountryAdapter countryAdapter=new CountryAdapter(this,android.R.layout.simple_spinner_item,list);
        spinner.setAdapter(countryAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}