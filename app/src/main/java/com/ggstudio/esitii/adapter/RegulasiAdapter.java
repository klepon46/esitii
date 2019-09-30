package com.ggstudio.esitii.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.ggstudio.esitii.R;
import com.ggstudio.esitii.activities.RegulasiActivity;
import com.ggstudio.esitii.model.Regulasi;

import java.util.List;

/**
 * Created by garya on 9/26/2019.
 */

public class RegulasiAdapter extends RecyclerView.Adapter<RegulasiAdapter.ViewHolder> {

    private List<Regulasi> regulasis;


    public RegulasiAdapter(List<Regulasi> regulasis) {
        this.regulasis = regulasis;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.rv_regulasi_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Regulasi regulasi = regulasis.get(position);
        holder.title.setText(regulasi.getTitle());
        holder.desc.setText(regulasi.getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RegulasiActivity.class);
                intent.putExtra("uri", regulasi.getFileUri());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return regulasis.size();
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
