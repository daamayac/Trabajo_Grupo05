package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import ec.edu.uce.trabajo_grupo05.R;

public class E1SupportToolbarActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbarc2e1);

        //We have to tell the activity where the toolbar is
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        /*
         * With a toolbar, we have to set the title text after
         * onCreate(), or the default label will overwrite our
         * settings.
         */

        //Set the title text
        mToolbar.setTitle("Android Recipes");
        //Set the subtitle text
        mToolbar.setSubtitle("Toolbar Recipes");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.c2e1support, menu);
        return true;
    }
}
