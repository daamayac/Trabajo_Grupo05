package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;

import ec.edu.uce.trabajo_grupo05.R;

public class E16DragTouchActivity extends AppCompatActivity implements OnLongClickListener {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2e16draganddrop);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Attach long-press listener to each ImageView
        findViewById(R.id.image1).setOnLongClickListener(this);
        findViewById(R.id.image2).setOnLongClickListener(this);
        findViewById(R.id.image3).setOnLongClickListener(this);
    }

	@Override
	public boolean onLongClick(View v) {
		DragShadowBuilder shadowBuilder = new DragShadowBuilder(v);
//	    DragShadowBuilder shadowBuilder = new DrawableDragShadowBuilder(v,
//	            getResources().getDrawable(R.drawable.ic_launcher));
	    v.startDrag(null, shadowBuilder, ((ImageView) v).getDrawable(), 0);    
		return true;
	}

}