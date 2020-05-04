package com.tachfour.solarloadcalculator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tachfour.solarloadcalculator.model.Invertersolarclass;

public class InvertersolarAdapter extends RecyclerView.Adapter<InvertersolarAdapter.ViewHolder> {
    private Invertersolarclass[] listdata;

    public InvertersolarAdapter(Invertersolarclass[] listdata) {
        this.listdata = listdata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.invertersolar_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Invertersolarclass myListData = listdata[position];
        holder.tv_title.setText(listdata[position].getTitle());

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_title;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.tv_title = (TextView) itemView.findViewById(R.id.tv_inverterfeature);

        }
    }
    }




