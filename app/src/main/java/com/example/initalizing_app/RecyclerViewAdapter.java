package com.example.initalizing_app;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

  List<Characters> data;
  Context ctx;

    public RecyclerViewAdapter(List<Characters> data, Context ctx) {
        this.data = data;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(ctx);
        view = inflater.inflate(R.layout.displaychar , parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.img.setImageResource(data.get(position).getImage());
        holder.tx.setText(data.get(position).getName());
        holder.orign.setText(data.get(position).getOrign());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx,Discription_Display.class);
                intent.putExtra("Name",data.get(position).getName());
                intent.putExtra("Dis",data.get(position).getDisc());
                intent.putExtra("Image",data.get(position).getImage());
                intent.putExtra("Orign",data.get(position).getOrign());
                intent.putExtra("Stage",data.get(position).getStage());
                intent.putExtra("Gif",data.get(position).getGif());
                intent.putExtra("Voice",data.get(position).getVoiceactor());
                ctx.startActivity(intent);

            }
        });
         }


    @Override
    public int getItemCount() {
        return data.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView tx,orign;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            tx = itemView.findViewById(R.id.name);
            cardView = itemView.findViewById(R.id.cardViewid);
            orign = itemView.findViewById(R.id.Orign);
        }

    }
}
