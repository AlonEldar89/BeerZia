package com.example.shmuelhanagid.maptestgal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class SearchBeer extends AppCompatActivity {
    AutoCompleteTextView text;
    MultiAutoCompleteTextView text1;
    String[] brands={"Goldstar","Carlsberg","Guinness","Beck's"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_beer);
        text=(AutoCompleteTextView)findViewById(R.id.autoCompBrand);
        //text1=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,brands);

        text.setAdapter(adapter);
        text.setThreshold(1);


        //text1.setAdapter(adapter);
        //text1.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }


}
