package com.sefakabatas.catbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sefakabatas.catbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class CatAdaptor extends RecyclerView.Adapter<CatAdaptor.CatHolder> {
    ArrayList<Cat> catArrayList;

    public CatAdaptor(ArrayList<Cat> catArrayList){
        this.catArrayList = catArrayList;
    }
    @NonNull
    @Override
    public CatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent, false);
        return new CatHolder(recyclerRowBinding);

    }

    @Override
    public void onBindViewHolder(@NonNull final CatHolder holder, final int position) {
        //show position name
        holder.binding.recyclerViewTextView.setText(catArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), ArtActivity.class);
                intent.putExtra("info","old");
                intent.putExtra("catId",catArrayList.get(position).id);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return catArrayList.size();
    }

    public class CatHolder extends RecyclerView.ViewHolder{
        private  RecyclerRowBinding binding;
        public CatHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;

        }
    }
}
