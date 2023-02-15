package com.example.quranapp;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class IndexAdapter extends RecyclerView.Adapter<IndexAdapter.ViewHolder> {
    LayoutInflater inflater;
    List<String> data;
    Context ctx;

    public IndexAdapter(Context ctx, List<String> data){
        this.inflater = LayoutInflater.from(ctx);
        this.data = data;
        this.ctx=ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.index_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // bind the data
        holder.indexTitle.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{
        TextView indexTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
