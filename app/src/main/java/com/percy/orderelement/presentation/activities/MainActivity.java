package com.percy.orderelement.presentation.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.percy.orderelement.data.model.Element;
import com.percy.orderelement.presentation.adapters.elementAdapter;
import com.percy.orderelement.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private elementAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        ArrayList<Element> myDataset = new ArrayList<>();

        myDataset.add(new Element(""));

        myDataset.add(new Element(""));

        myDataset.add(new Element(""));

        SharedPreferences preferences;
        preferences = getSharedPreferences("credenciales", Context.MODE_PRIVATE);

        int green = preferences.getInt("green",0);
        int red = preferences.getInt("red",0);
        int blue = preferences.getInt("blue",0);

        String ultimo_toque_valor = preferences.getString("ultimo_valor",null);
        String penultimo_toque_valor = preferences.getString("penultimo_valor",null);

        mAdapter = new elementAdapter(myDataset,green,red,blue,ultimo_toque_valor,penultimo_toque_valor);


//        preferences.edit().clear().commit();
        if(green>=3 || red>=3 || red>=3){
            mRecyclerView.setAdapter(mAdapter);
            preferences.edit().clear().commit();
        }else{
            mRecyclerView.setAdapter(mAdapter);
        }
    }

}
