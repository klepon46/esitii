package com.ggstudio.esitii.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ggstudio.esitii.R;

/**
 * Created by garya on 10/7/2019.
 */

public class RegulasiSupportAdapter extends RecyclerView.Adapter<RegulasiSupportAdapter.ViewHolder> {
    @NonNull
    @Override
    public RegulasiSupportAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_regulasi_item, parent, false);

        return new RegulasiSupportAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RegulasiSupportAdapter.ViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView title, desc;

        public ViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.item_title);
            desc = itemView.findViewById(R.id.item_desc);

            title.setTextColor(itemView.getResources().getColor(R.color.end_green));
        }
    }
}
