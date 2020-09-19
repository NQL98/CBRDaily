package com.example.cbrdaily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ValuteAdapter extends RecyclerView.Adapter<ValuteAdapter.ViewHolder> {

    private Context context;
    private List<Valute> list;

    public ValuteAdapter(Context context, List<Valute> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Valute valute = list.get(position);

        holder.textName.setText(valute.getName());
        holder.textValue.setText(String.valueOf(valute.getValue()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textName, textValue;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.valuteName);
            textValue = itemView.findViewById(R.id.valuteValue);
        }
    }
}

