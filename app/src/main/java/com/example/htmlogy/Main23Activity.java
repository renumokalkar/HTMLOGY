package com.example.htmlogy;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        VideoView videoView=findViewById(R.id.video3);
        String videoPath="android.resource://" +getPackageName()+ "/" + R.raw.formatting;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }
}
