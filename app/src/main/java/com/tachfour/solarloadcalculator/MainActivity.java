package com.tachfour.solarloadcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.tachfour.solarloadcalculator.fragment.SelectRequiredSolutionFragment;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SelectRequiredSolutionFragment requiredSolutionFragment=new SelectRequiredSolutionFragment();
        FragmentManager fm=getSupportFragmentManager();
        fm.beginTransaction().add(R.id.frame_container,requiredSolutionFragment).commit();


    }
}
