package com.tachfour.solarloadcalculator.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tachfour.solarloadcalculator.R;
import com.tachfour.solarloadcalculator.SelectAppliance;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectYourLoadFragment extends Fragment {

    View vw_selecthome;
    public SelectYourLoadFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_select_your_load, container, false);

        vw_selecthome=view.findViewById(R.id.fragbacksav_relone);

        vw_selecthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SelectApplianceFragment appliance=new SelectApplianceFragment();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_container,appliance);
                transaction.commit();
            }
        });

        return view;
    }

}
