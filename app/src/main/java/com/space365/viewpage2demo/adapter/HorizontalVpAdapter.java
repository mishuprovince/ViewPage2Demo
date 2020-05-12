package com.space365.viewpage2demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;


import com.space365.viewpage2demo.R;

import java.util.ArrayList;
import java.util.List;

public class HorizontalVpAdapter extends RecyclerView.Adapter<HorizontalVpAdapter.HorizontalVpViewHolder> {

    private List<Integer> colors;
    private Context context;

    public HorizontalVpAdapter(Context context) {
        this.context=context;

        if(colors==null){
            colors=new ArrayList<>();
            colors.add(android.R.color.holo_red_light);
            colors.add(android.R.color.holo_orange_dark);
            colors.add(android.R.color.holo_red_dark);
        }
    }


    @NonNull
    @Override
    public HorizontalVpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalVpViewHolder(LayoutInflater.from(this.context).inflate((R.layout.activity_main),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalVpViewHolder holder, int position) {
        holder.constraintLayout.setBackgroundResource(colors.get(position));
        holder.textView.setText("第"+position);
    }

    @Override
    public int getItemCount() {
        if(colors==null)
        return 0;
        return  colors.size();
    }

    class HorizontalVpViewHolder extends RecyclerView.ViewHolder{

        ConstraintLayout constraintLayout;
        TextView textView;
        public HorizontalVpViewHolder(@NonNull View itemView) {
            super(itemView);
            constraintLayout=itemView.findViewById(R.id.background);
            textView=itemView.findViewById(R.id.page_number);
        }
    }
}
