package ec.edu.uce.trabajo_grupo05.ejercicios.c1;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import ec.edu.uce.trabajo_grupo05.R;


public class E07EmptyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1e7);
        
        ListView list = (ListView)findViewById(R.id.mylist);
        TextView empty = (TextView)findViewById(R.id.myempty);
        
        /*
         * Attach the empty view.  The framework will show this
         * view when the ListView's adapter has no elements.
         */
        list.setEmptyView(empty);

        //Continue adding adapters and data to the list
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

}
