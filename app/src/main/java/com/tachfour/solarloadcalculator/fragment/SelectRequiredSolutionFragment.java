package com.tachfour.solarloadcalculator.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tachfour.solarloadcalculator.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SelectRequiredSolutionFragment extends Fragment {
    View vw_backupoff;

    public SelectRequiredSolutionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_select_required_solution, container, false);

        vw_backupoff=view.findViewById(R.id.fragbacksav_relone);

vw_backupoff.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        SelectYourLoadFragment loadFragment=new SelectYourLoadFragment();
        FragmentTransaction  transaction=getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container,loadFragment);
        transaction.commit();
    }
});



        return view;
    }

}
