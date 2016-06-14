package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.widget.ImageView;

import ec.edu.uce.trabajo_grupo05.R;

public class E04FlipperActivity extends AppCompatActivity {

    private boolean mIsHeads;
    private ObjectAnimator mFlipper;
    private Bitmap mHeadsImage, mTailsImage;
    private ImageView mFlipImage;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1e41);

        mHeadsImage = BitmapFactory.decodeResource(getResources(), R.drawable.heads);
        mTailsImage = BitmapFactory.decodeResource(getResources(), R.drawable.tails);
        
        mFlipImage = (ImageView)findViewById(R.id.flip_image);
        mFlipImage.setImageBitmap(mHeadsImage);
        mIsHeads = true;
        
        mFlipper = ObjectAnimator.ofFloat(mFlipImage, "rotationY", 0f, 360f);
        mFlipper.setDuration(500);
        mFlipper.addUpdateListener(new AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                if (animation.getAnimatedFraction() >= 0.25f && mIsHeads) {
                    mFlipImage.setImageBitmap(mTailsImage);
                    mIsHeads = false;
                }
                if (animation.getAnimatedFraction() >= 0.75f && !mIsHeads) {
                    mFlipImage.setImageBitmap(mHeadsImage);
                    mIsHeads = true;
                }
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN) {
            mFlipper.start();
            return true;
        }
        return super.onTouchEvent(event);
    }
}