package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import ec.edu.uce.trabajo_grupo05.R;

public class E02FullActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Request this feature so the ActionBar will hide
        supportRequestWindowFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
        setContentView(R.layout.activity_c1e2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

    }
    
    public void onToggleClick(View v) {
        //Here we only need to hide the UI on a tap because
        // the system will make the controls re-appear automatically
        // anytime the screen is tapped after they are hidden. 
        v.setSystemUiVisibility(
                /* This flag tells Android not to shift 
                 * our layout when resizing the window to
                 * hide/show the system elements
                 */
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                /* This flag hides the system status bar.  If
                 * ACTION_BAR_OVERLAY is requested, it will hide
                 * the ActionBar as well.
                 */
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                /* This flag hides the on-screen controls
                 */
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    }
}
