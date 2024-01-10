package com.maverickallies.glideandpicasolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {
    Button btnLoadImg;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadImg = (Button)findViewById(R.id.btnLoadNewImgId);
        imageView = (ImageView)findViewById(R.id.imgViewGlideId);



    }
    public void LoadNewImage(View view){
        String imgURL = "https://picsum.photos/200";
        Glide.with(this).load(imgURL).apply(RequestOptions.bitmapTransform(new RoundedCorners(18))).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
    }
    public void NextPage(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}