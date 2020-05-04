package com.tachfour.solarloadcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculateResetActivity extends AppCompatActivity {

 Button btn_showmore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_reset);



    }

    public void btnknowmore(View view) {

        startActivity(new Intent(CalculateResetActivity.this,InverterSolarFeature.class));
    }
}
