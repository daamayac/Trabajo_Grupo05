package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.animation.Animator;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

import ec.edu.uce.trabajo_grupo05.R;

public class E05MainActivity extends AppCompatActivity {

    LinearLayout mContainer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1e5);

        // Layout Changes Animation
        mContainer = (LinearLayout) findViewById(R.id.verticalContainer);
        LayoutTransition transition = new LayoutTransition();
        mContainer.setLayoutTransition(transition);

        // Override the default appear animation with a flip in
        Animator appearAnim = ObjectAnimator.ofFloat(null, "rotationY", 90f, 0f)
                .setDuration(transition.getDuration(LayoutTransition.APPEARING));
        transition.setAnimator(LayoutTransition.APPEARING, appearAnim);
        transition.setStartDelay(LayoutTransition.APPEARING, 0);
        // Override the default disappear animation with a flip out
        Animator disappearAnim = ObjectAnimator.ofFloat(null, "rotationX", 0f, 90f)
                .setDuration(transition.getDuration(LayoutTransition.DISAPPEARING));
        transition.setAnimator(LayoutTransition.DISAPPEARING, disappearAnim);
        transition.setStartDelay(LayoutTransition.DISAPPEARING, 0);

        // Override the default change disappear animation with a more animated slide
        // We are animating several properties at once, so we create an animation out
        //  of multiple PropertyValueHolder objects.  This animation slides the views
        //  in and temporarily shrinks the view to half size.
        PropertyValuesHolder pvhSlide = PropertyValuesHolder.ofFloat("y", 0, 1);
        PropertyValuesHolder pvhScaleY = PropertyValuesHolder.ofFloat("scaleY", 1f, 0.5f, 1f);
        PropertyValuesHolder pvhScaleX = PropertyValuesHolder.ofFloat("scaleX", 1f, 0.5f, 1f);
        Animator changingAppearingAnim = ObjectAnimator.ofPropertyValuesHolder(
                    this, pvhSlide, pvhScaleY, pvhScaleX)
                .setDuration(transition.getDuration(LayoutTransition.CHANGE_DISAPPEARING));
        transition.setAnimator(LayoutTransition.CHANGE_DISAPPEARING, changingAppearingAnim);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    public void onAddClick(View v) {
        Button button = new Button(this);
        button.setText("Click To Remove");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContainer.removeView(v);
            }
        });

        mContainer.addView(button, new LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
    }
}