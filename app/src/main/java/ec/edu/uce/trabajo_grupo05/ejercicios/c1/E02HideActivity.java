package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ec.edu.uce.trabajo_grupo05.R;

public class E02HideActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1e2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
    
    public void onToggleClick(View v) {
        //Here we only need to hide the controls on a tap because
        // the system will make the controls re-appear automatically
        // anytime the screen is tapped after they are hidden.
        v.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
}
