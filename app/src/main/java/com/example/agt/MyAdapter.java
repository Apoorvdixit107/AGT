package com.example.agt;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<Model> data;

    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
holder.bind(position);
    }
    void setData(List<Model> dataholder){
        data=dataholder;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
     class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView text;
        Fragment temp=new Home_Frag();


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            text=itemView.findViewById(R.id.title);
        }
        void bind(int position){
            Model model=data.get(position);
       Picasso.get().load(data.get(position).getImg()).into(img);
//          Glide.with(temp).load(data.get(position).getImg()).into(img);

            text.setText(data.get(position).getText());



        }

    }
}
