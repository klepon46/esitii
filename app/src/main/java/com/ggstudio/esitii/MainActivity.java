package com.ggstudio.esitii;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateFields();
    }

    public void populateFields() {


        ImageView ivInformation = findViewById(R.id.imgInformation);
        ImageView ivRegualasi = findViewById(R.id.imgRegulasi);
        ImageView ivVideo = findViewById(R.id.imgVideo);
        ImageView ivOther1 = findViewById(R.id.imgOther1);
        ImageView ivOther2 = findViewById(R.id.img_other2);
        ImageView ivOther3 = findViewById(R.id.img_other3);

        Glide.with(this).load(R.mipmap.book_guide).into(ivInformation);
        Glide.with(this).load(R.mipmap.paper).into(ivRegualasi);
        Glide.with(this).load(R.mipmap.video).into(ivVideo);
        Glide.with(this).load(R.mipmap.img_other).into(ivOther1);
        Glide.with(this).load(R.mipmap.img_other).into(ivOther2);
        Glide.with(this).load(R.mipmap.img_other).into(ivOther3);
    }
}
