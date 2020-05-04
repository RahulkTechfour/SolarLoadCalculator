package com.tachfour.solarloadcalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.tachfour.solarloadcalculator.model.ListApplianceItem;

import java.util.List;

public class ListApplianceAdapter extends RecyclerView.Adapter<ListApplianceAdapter.SearchViewHolder> {

    private Context context;
    private List<ListApplianceItem>applianceItems;

    public ListApplianceAdapter(Context context, List<ListApplianceItem> applianceItems) {
        this.context = context;
        this.applianceItems = applianceItems;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemview=inflater.inflate(R.layout.appliancelist_view,parent,false);


        return new SearchViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {


        holder.tv_smallappliance.setText(applianceItems.get(position).getSmallappliance());
        holder.tv_wattage.setText(applianceItems.get(position).getWattage());

    }

    @Override
    public int getItemCount() {
        return applianceItems.size();
    }

    public class SearchViewHolder extends RecyclerView.ViewHolder{

        public TextView tv_smallappliance,tv_wattage;

        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_smallappliance=itemView.findViewById(R.id.smallappliance_item);
            tv_wattage=itemView.findViewById(R.id.appliance_wattageitem);

        }
    }
}
