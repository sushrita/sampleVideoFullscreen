package com.example.hungvu.videocustom;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;


public class MainActivity extends Activity {

    private CustomVideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video = (CustomVideoView) findViewById(R.id.myvideoview);
        video.setVideoURI(Uri.parse("http://html5demos.com/assets/dizzy.mp4"));
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });
    }
}
