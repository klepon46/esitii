package com.ggstudio.esitii.activities;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.ggstudio.esitii.R;

public class VideoOldActivity extends AppCompatActivity {

    private VideoView vidView;
    private MediaController mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_old);


        vidView = findViewById(R.id.vid_view);


        String path = "android.resource://" + getPackageName() + "/" + R.raw.vidsiinas;


        mc = new MediaController(this);
        mc.setAnchorView(vidView);


        vidView.setMediaController(mc);
        vidView.setVideoURI(Uri.parse(path));
        vidView.start();
    }
}
