package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import ec.edu.uce.trabajo_grupo05.R;

public class E14RemoteScrollActivity extends AppCompatActivity implements View.OnTouchListener {

    private TextView mTouchText;
    private HorizontalScrollView mScrollView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainc2e131);
        
        mTouchText = (TextView) findViewById(R.id.text_touch);
        mScrollView = (HorizontalScrollView) findViewById(R.id.scroll_view);
        //Attach a listener for touch events to the top view
        mTouchText.setOnTouchListener(this);
    }
    
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        // You can massage the event location if necessary.
        // Here we set the vertical location for each event to
        // the middle of the HorizontalScrollView.
        
        // View's expect events to be relative to their own coordinates.
        event.setLocation(event.getX(), mScrollView.getHeight() / 2);
        
        // Forward each event from the TextView to the
        // HorizontalScrollView
        mScrollView.dispatchTouchEvent(event);
        return true;
    }
}
