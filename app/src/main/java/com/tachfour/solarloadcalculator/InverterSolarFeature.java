package com.tachfour.solarloadcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.tachfour.solarloadcalculator.model.Invertersolarclass;

public class InverterSolarFeature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inverter_solar_feature);

        Invertersolarclass[] myListData = new Invertersolarclass[] {
                new Invertersolarclass("INVERTER FEAURE"),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_insolarfeature);
        InvertersolarAdapter adapter = new InvertersolarAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


    }




    }
