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

public class VerticalVpAdapter extends RecyclerView.Adapter<VerticalVpAdapter.VerticalVpViewHolder> {

    private Context context;
    private List<Integer> colors;

    public VerticalVpAdapter(Context context) {
        this.context = context;
        if (colors == null) {
            colors = new ArrayList<>();
            colors.add(R.color.colorPrimaryDark);
            colors.add(R.color.colorPrimary);
            colors.add(R.color.colorAccent);
        }
    }

    @NonNull
    @Override
    public VerticalVpViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VerticalVpViewHolder(LayoutInflater.from(this.context).inflate(R.layout.activity_main, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VerticalVpViewHolder holder, int position) {
        holder.constraintLayout.setBackgroundResource(colors.get(position));
        holder.textView.setText("第" + position);
    }

    @Override
    public int getItemCount() {
        if(colors==null)
            return 0;
        return  colors.size();

    }

    class VerticalVpViewHolder extends RecyclerView.ViewHolder {
        ConstraintLayout constraintLayout;
        TextView textView;

        public VerticalVpViewHolder(@NonNull View itemView) {
            super(itemView);
            constraintLayout = itemView.findViewById(R.id.background);
            textView = itemView.findViewById(R.id.page_number);
        }
    }
}
