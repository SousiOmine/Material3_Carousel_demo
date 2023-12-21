package com.example.material_carousel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselHolder> {
    ArrayList<CarouselModel> models;
    MainActivity main_activity;
    public CarouselAdapter(ArrayList<CarouselModel> list, MainActivity ma)
    {
        this.models = list;
        this.main_activity = ma;
    }

    @NonNull
    @Override
    public CarouselHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //なにかよくわかっていない
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.carousel_layout, parent, false);
        CarouselHolder carouselHolder = new CarouselHolder(inflate);
        return carouselHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselHolder holder, int position) {
        //各項目に必要な要素をセットする
        holder.imageView.setImageBitmap(models.get(position).image);
        holder.textView.setText(models.get(position).text);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tapFunc();
            }
        });
    }
    
    private void tapFunc()  //要素が押されたときに実行するやつをここに書く
    {
        Toast.makeText(main_activity, "九条カレン", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
