package com.example.shmuelhanagid.maptestgal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import static com.example.shmuelhanagid.maptestgal.Beer.beerBrands;

public class SearchBeer extends AppCompatActivity {
    AutoCompleteTextView text;
    MultiAutoCompleteTextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_beer);
        text=(AutoCompleteTextView)findViewById(R.id.autoCompBrand);
        //text1=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Beer.beerBrands);

        text.setAdapter(adapter);
        text.setThreshold(1);


        //text1.setAdapter(adapter);
        //text1.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }


}
