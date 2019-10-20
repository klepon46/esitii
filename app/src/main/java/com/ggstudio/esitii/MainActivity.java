package com.ggstudio.esitii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ggstudio.esitii.activities.ContactUsActivity;
import com.ggstudio.esitii.activities.ReadMoreActivity;
import com.ggstudio.esitii.activities.RegulasiListActivity;
import com.ggstudio.esitii.activities.PanduanActivity;
import com.ggstudio.esitii.activities.RegulasiNewActivity;
import com.ggstudio.esitii.activities.VideoActivity;
import com.ggstudio.esitii.activities.VideoOldActivity;
import com.ggstudio.esitii.activities.WebViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateFields();
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.card_regulasi:
                intent.setClass(this, RegulasiNewActivity.class);
                startActivity(intent);
                break;
            case R.id.card_sop:
                intent.setClass(this, WebViewActivity.class);
                startActivity(intent);
                break;
            case R.id.card_video:
//                intent.setClass(this, VideoOldActivity.class);
//                startActivity(intent);
                break;
            case R.id.btn_read_more:
                intent.setClass(this, ReadMoreActivity.class);
                startActivity(intent);
                break;
            case R.id.card_other1:
                intent.setClass(this, VideoOldActivity.class);
                startActivity(intent);
                break;
            case R.id.card_other2:
                intent.setClass(this, PanduanActivity.class);
                startActivity(intent);
                break;
            case R.id.card_other3:
                intent.setClass(this, ContactUsActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    public void populateFields() {


        ImageView ivInformation = findViewById(R.id.imgInformation);
        ImageView ivRegualasi = findViewById(R.id.imgRegulasi);
        ImageView ivVideo = findViewById(R.id.imgVideo);
        ImageView ivOther1 = findViewById(R.id.imgOther1);
        ImageView ivOther2 = findViewById(R.id.img_other2);
        ImageView ivOther3 = findViewById(R.id.img_other3);
        Button btnReadMore = findViewById(R.id.btn_read_more);

        Glide.with(this).load(R.mipmap.ic_siinas).into(ivInformation);
        Glide.with(this).load(R.mipmap.img_regulasi_new).into(ivRegualasi);
        Glide.with(this).load(R.mipmap.img_vid_new).into(ivVideo);
        Glide.with(this).load(R.mipmap.img_manual).into(ivOther1);
        Glide.with(this).load(R.mipmap.img_informasi_new).into(ivOther2);
        Glide.with(this).load(R.mipmap.img_contact_new).into(ivOther3);


        CardView cardRegulasi = findViewById(R.id.card_regulasi);
        CardView cardSop = findViewById(R.id.card_sop);
        CardView cardVideo = findViewById(R.id.card_video);
        CardView cardInformasiLain = findViewById(R.id.card_other1);
        CardView cardManual = findViewById(R.id.card_other2);
        CardView cardContactUs = findViewById(R.id.card_other3);

        cardRegulasi.setOnClickListener(this);
        cardSop.setOnClickListener(this);
        cardVideo.setOnClickListener(this);
        cardContactUs.setOnClickListener(this);
        cardInformasiLain.setOnClickListener(this);
        cardManual.setOnClickListener(this);
        btnReadMore.setOnClickListener(this);

    }


}
