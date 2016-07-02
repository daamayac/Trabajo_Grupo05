package ec.edu.uce.trabajo_grupo05.ejercicios.c4;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import ec.edu.uce.trabajo_grupo05.R;

public class E10PlayActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    
    Button mPlay;
    MediaPlayer mPlayer;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mPlay = new Button(this);
        mPlay.setText("Play Sound");
        mPlay.setOnClickListener(playListener);
        
        setContentView(R.layout.mainc4e10);
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mPlayer != null) {
            mPlayer.release();
        }
    }
    
    private View.OnClickListener playListener = new View.OnClickListener() {
        
        @Override
        public void onClick(View v) {
            if(mPlayer == null) {
                try {
                    mPlayer = MediaPlayer.create(E10PlayActivity.this, R.raw.sound);
                    mPlayer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                mPlayer.stop();
                mPlayer.release();
                mPlayer = null;
            }
        }
    };

    @Override
    public void onCompletion(MediaPlayer mp) {
        mPlayer.release();
        mPlayer = null;
    }
    
}