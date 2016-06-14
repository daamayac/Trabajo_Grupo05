package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import ec.edu.uce.trabajo_grupo05.R;

public class E13PanScrollActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		E13PanScrollView scrollView = new E13PanScrollView(this);
//        TwoDimensionGestureScrollView scrollView = new TwoDimensionGestureScrollView(this);

//		ImageView iv = new ImageView(this);
//		iv.setImageResource(R.drawable.ic_launcher);
//
//		FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(800, 1500);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        for(int i=0; i < 5; i++) {
    		ImageView iv = new ImageButton(this);
	    	iv.setImageResource(R.drawable.ic_launcher);
            layout.addView(iv, new LinearLayout.LayoutParams(1000, 500));
        }

		scrollView.addView(layout);
		setContentView(scrollView);
	}
}
