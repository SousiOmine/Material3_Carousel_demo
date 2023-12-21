package com.example.material_carousel;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CarouselHolder extends RecyclerView.ViewHolder{
    public ImageView imageView;
    public TextView textView;

    public CarouselHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.carousel_image_view);
        textView = itemView.findViewById(R.id.carousel_text_view);
    }
}
