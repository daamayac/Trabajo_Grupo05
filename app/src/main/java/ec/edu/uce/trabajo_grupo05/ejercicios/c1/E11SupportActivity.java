package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ec.edu.uce.trabajo_grupo05.R;

public class E11SupportActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1e11);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
    
    public void onAddClick(View v) {
        E11SupportFragment fragment = new E11SupportFragment();
        
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //Must be called first!
//        ft.setCustomAnimations(R.anim.activity_open_enter, R.anim.activity_open_exit, R.anim.activity_close_enter, R.anim.activity_close_exit);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.replace(R.id.container_fragment, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}
