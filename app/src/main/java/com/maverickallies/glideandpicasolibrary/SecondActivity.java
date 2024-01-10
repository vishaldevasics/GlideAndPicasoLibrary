package com.maverickallies.glideandpicasolibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    Button loadImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        imageView = (ImageView)findViewById(R.id.imgViewPicassoId);

    }
    public void LoadPicassoNewImage(View view){

        String imgURL = "https://picsum.photos/200";

        Picasso.get().load(imgURL).memoryPolicy(MemoryPolicy.NO_CACHE,MemoryPolicy.NO_STORE).into(imageView);


    }
}