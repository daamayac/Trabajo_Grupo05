package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ec.edu.uce.trabajo_grupo05.R;

public class E06UniversalActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1e6);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
}