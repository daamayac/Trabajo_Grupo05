package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.os.Bundle;
import android.view.View;

import ec.edu.uce.trabajo_grupo05.R;

public class E02DarkActivity extends E02MainActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1e2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
    
    public void onToggleClick(View v) {
        int currentVis = v.getSystemUiVisibility();
        int newVis;
        if ((currentVis & View.SYSTEM_UI_FLAG_LOW_PROFILE) == View.SYSTEM_UI_FLAG_LOW_PROFILE) {
            newVis = View.SYSTEM_UI_FLAG_VISIBLE;
        } else {
            newVis = View.SYSTEM_UI_FLAG_LOW_PROFILE;
        }
        v.setSystemUiVisibility(newVis);
    }
}
