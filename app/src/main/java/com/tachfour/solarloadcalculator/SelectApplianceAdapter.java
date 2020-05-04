package com.tachfour.solarloadcalculator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tachfour.solarloadcalculator.model.Invertersolarclass;
import com.tachfour.solarloadcalculator.model.SelectApplianceClass;

public class SelectApplianceAdapter extends RecyclerView.Adapter<SelectApplianceAdapter.SelectApplianceViewHolder> {

    private SelectApplianceClass[] listdata;

    public SelectApplianceAdapter(SelectApplianceClass[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public SelectApplianceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.selectappliance_item,parent, false);
        SelectApplianceViewHolder viewHolder = new SelectApplianceViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SelectApplianceViewHolder holder, int position) {


        holder.tv_Appliancename.setText(listdata[position].getTv_appliancename());
        holder.tv_Appliancevalue.setText(listdata[position].getTv_appliancevalue());
        holder.tv_quantity.setText(listdata[position].getTv_quantity());
        holder.tv_wattage.setText(listdata[position].getTv_wattage());

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class SelectApplianceViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_Appliancename;
        public TextView tv_Appliancevalue;
        public TextView tv_quantity;
        public TextView tv_wattage;

        public SelectApplianceViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_Appliancename=itemView.findViewById(R.id.tv_cfl);
            this.tv_Appliancevalue=itemView.findViewById(R.id.tv_cflvalue);
            this.tv_quantity=itemView.findViewById(R.id.tv_quantityvalue);
            this.tv_wattage=itemView.findViewById(R.id.tv_wattage);
        }


    }
}
