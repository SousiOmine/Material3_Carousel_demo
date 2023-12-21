package com.example.material_carousel;

import android.graphics.Bitmap;

public class CarouselModel {
    public Bitmap image;
    public String text;

    public CarouselModel(Bitmap img, String txt) {
        this.image = img;
        this.text = txt;
    }
}
