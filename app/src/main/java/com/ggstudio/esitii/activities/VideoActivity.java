package com.ggstudio.esitii.activities;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.ggstudio.esitii.R;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

//        getSupportActionBar().setHomeButtonEnabled(true);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        VideoView vidView = findViewById(R.id.vid_view);


        String path = "android.resource://" + getPackageName() + "/" + R.raw.vidsiinas;

        MediaController mc = new MediaController(this);
        mc.setAnchorView(vidView);
        //mc.show(1000);

        vidView.setMediaController(mc);
        vidView.setVideoURI(Uri.parse(path));
        vidView.start();
    }
}
