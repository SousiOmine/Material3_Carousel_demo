package com.example.material_carousel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<CarouselModel> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.karen);
        //使った画像がでかすぎて何もしないとエラーを吐くので小さくしてます
        bmp = Bitmap.createScaledBitmap(bmp, 500, 500, false);
        models.add(new CarouselModel(bmp, "Karen1"));
        models.add(new CarouselModel(bmp, "Karen2"));
        models.add(new CarouselModel(bmp, "Karen3"));
        models.add(new CarouselModel(bmp, "Karen4"));
        models.add(new CarouselModel(bmp, "Karen5"));

        RecyclerView recyclerView = findViewById(R.id.carousel_recycler_view);
        //アダプターを指定
        recyclerView.setAdapter(new CarouselAdapter(models, this));
    }
}