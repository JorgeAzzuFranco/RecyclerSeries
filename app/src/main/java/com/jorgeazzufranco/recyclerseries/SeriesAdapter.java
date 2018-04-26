package com.jorgeazzufranco.recyclerseries;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by uca on 04-18-18.
 */

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder>{

    private ArrayList<Serie> series;
    private Context mCtx;
    private Button ver;

    @Override
    public SeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mCtx).inflate(R.layout.activity_cardview,parent,false);
        return (new SeriesViewHolder(v));
    }

    @Override
    public void onBindViewHolder(SeriesViewHolder holder, int position) {
        holder.name.setText(series.get(position).getName());
        holder.img.setImageResource(series.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return series.size();
    }

    public static class SeriesViewHolder extends RecyclerView.ViewHolder{

        CardView card;
        TextView name;
        ImageView img;
        Button ver;

        public SeriesViewHolder(View itemView){
            super(itemView);
            card = itemView.findViewById(R.id.card_view);
            name = itemView.findViewById(R.id.name);
            img = itemView.findViewById(R.id.img);
            ver=itemView.findViewById(R.id.ver);
        }
    }

    public SeriesAdapter(ArrayList<Serie> series, Context ctx){
        this.series = series;
        this.mCtx = ctx;
    }


}
