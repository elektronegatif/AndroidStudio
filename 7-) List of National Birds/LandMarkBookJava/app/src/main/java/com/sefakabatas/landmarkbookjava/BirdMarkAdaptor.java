package com.sefakabatas.landmarkbookjava;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sefakabatas.landmarkbookjava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

// 1 -> View Holder create
// 2 -> onCreateViewHolder
// 3 -> onBindViewHolder
// 4 -> getItemCount
public class BirdMarkAdaptor extends RecyclerView.Adapter<BirdMarkAdaptor.BirdMarkHolder>{
    ArrayList<LandMark> landMarkArrayList;
    public BirdMarkAdaptor(ArrayList<LandMark> landMarkArrayList) {
        this.landMarkArrayList = landMarkArrayList;
    }



    @NonNull
    @Override
    public BirdMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false);
        return new BirdMarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull final BirdMarkHolder holder, final int position) {
        //layout view
        holder.binding.recyclerViewTextView.setText(landMarkArrayList.get(position).country);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailyActivite.class);
                //intent.putExtra("birdmark",landMarkArrayList.get(position));
                Singleton singleton = Singleton.getInstance();
                singleton.setSentBirdMark(landMarkArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        //Items return count
        return landMarkArrayList.size();
    }

    public class BirdMarkHolder extends RecyclerView.ViewHolder{
        //binding
        private RecyclerRowBinding binding;

        public BirdMarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
