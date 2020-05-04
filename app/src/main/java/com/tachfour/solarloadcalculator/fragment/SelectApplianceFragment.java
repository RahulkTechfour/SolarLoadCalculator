package com.tachfour.solarloadcalculator.fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.tachfour.solarloadcalculator.DatabaseOpenHelper;
import com.tachfour.solarloadcalculator.ListApplianceAdapter;
import com.tachfour.solarloadcalculator.R;
import com.tachfour.solarloadcalculator.SelectApplianceAdapter;
import com.tachfour.solarloadcalculator.model.ListApplianceItem;
import com.tachfour.solarloadcalculator.model.SelectApplianceClass;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class SelectApplianceFragment extends Fragment {
    Button btn_next;
    RecyclerView rv_selectappliance;
    RecyclerView rv_search;
   private EditText et_selectappliancesearch;
private Context mContext;

    List<ListApplianceItem> listApplianceItems;
  RecyclerView.LayoutManager layoutManager;
  ListApplianceAdapter applianceAdapter;
  List<String>suggestlist=new ArrayList<>();
  DatabaseOpenHelper databaseOpenHelper;
    public SelectApplianceFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_select_appliance, container, false);

        rv_selectappliance=view.findViewById(R.id.selectappliance_recycle);
        btn_next=view.findViewById(R.id.selectappliance_nextbtn);
        et_selectappliancesearch=view.findViewById(R.id.et_selectappliancesearch);
        rv_search=view.findViewById(R.id.appliance_list);
        listApplianceItems=new ArrayList<>();

        layoutManager=new LinearLayoutManager(mContext);
        rv_search.setLayoutManager(layoutManager);
        rv_search.setHasFixedSize(true);

databaseOpenHelper=new DatabaseOpenHelper(mContext);
et_selectappliancesearch.setHint("Search");

     loadSuggestList();
        SelectApplianceClass[] myListDatas = new SelectApplianceClass[] {
                new SelectApplianceClass("CFL Heavy-","30Watt","1","30"),

        };


        SelectApplianceAdapter adapters = new SelectApplianceAdapter(myListDatas);
        rv_selectappliance.setHasFixedSize(true);
        rv_selectappliance.setLayoutManager(new LinearLayoutManager(mContext));
        rv_selectappliance.setAdapter(adapters);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        return view;
    }

    private void loadSuggestList() {

        suggestlist=databaseOpenHelper.getAppliancename();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext=context;
    }
}
