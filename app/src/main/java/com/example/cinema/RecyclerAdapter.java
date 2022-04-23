package com.example.cinema;
import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.filmViewholder> {
    ArrayList<film> films;
    Context mContext;
    public RecyclerAdapter(ArrayList<film> films,Context context) {

        this.films = films;
        this.mContext=context;
    }
    @NonNull
    @Override
    public filmViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //  Toast.makeText(RecyclerAdapter.this,"yeeehhhhhhhh!",Toast.LENGTH_LONG).show();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.film,null,false);
        filmViewholder viewholder = new filmViewholder(v);
        return viewholder;
    }
    @Override
    public void onBindViewHolder(@NonNull filmViewholder holder, int position) {
        film f = films.get(position);
        holder.iv.setImageResource(f.getImg());
        holder.tv2.setText(f.getTitle());
        holder.tv3.setText(f.getDescription());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            StateListAnimator stateListAnimator = AnimatorInflater
                    .loadStateListAnimator(mContext, R.drawable.animation);
            holder.b1.setStateListAnimator(stateListAnimator);
            holder.b1.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    Intent u = new Intent(mContext, MainActivity5.class);
                    mContext.startActivity(u);
                }
            });
        }}
    @Override
    public int getItemCount() {
        return films.size();
    }
    // class view holder
    class filmViewholder extends RecyclerView.ViewHolder{
        TextView tv2 , tv3 ;
        ImageView iv;
        Button b1;
        public filmViewholder(@NonNull View itemView) {
            super(itemView);
            tv2 = itemView.findViewById(R.id.textView2);
            tv3 = itemView.findViewById(R.id.textView3);
            iv= itemView.findViewById(R.id.imageView);
            b1 = itemView.findViewById(R.id. button2);
        }

    }


}

 /*   Button f = findViewById(R.id.button2);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                StateListAnimator stateListAnimator = AnimatorInflater
                .loadStateListAnimator(this, R.drawable.animation);
                f.setStateListAnimator(stateListAnimator);
                f.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {


         Intent u = new Intent(mContext, MainActivity5.class);
               mContext.startActivity(u);
        }

        });
        }*/