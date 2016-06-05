package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import ec.edu.uce.trabajo_grupo05.R;

public class E18PagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewPager pager = new ViewPager(this);
        pager.setAdapter(new E18ImagePagerAdapter(this));
        setContentView(pager);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }


}
