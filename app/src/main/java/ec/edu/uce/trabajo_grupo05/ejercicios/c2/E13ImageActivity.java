package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ec.edu.uce.trabajo_grupo05.R;

public class E13ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        E13RotateZoomImageView imageView = new E13RotateZoomImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher);
        
        setContentView(imageView);
    }
}
