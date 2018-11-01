package com.example.admin.appshadist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.appshadist.R;
import com.example.admin.appshadist.model.Doa;
import com.example.admin.appshadist.viewholder.DoaHolder;

import java.util.List;

/**
 * Created by admin on 08/10/2018.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaHolder> {

    private List<Doa> doas;
    private DoaListener listener;
    private Object v;

    public DoaAdapter(List<Doa> doas){
        this.doas = doas;
    }

    public void setListener(DoaListener listener) {
        this.listener = listener;
    }


    @Override
    public DoaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return DoaHolder (LayoutInflater.from(parent.getContext()).inflate(R.layout.item_doa, parent, false));
    }


    @Override
    public void onBindViewHolder(DoaHolder holder, final int position) {
        holder.txtNamaDoa.setText(doas.get(position).getNama());
        holder.txtArtiDoa.setText(doas.get(position).getArti());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onClick(doas.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return doas.size();
    }
}
