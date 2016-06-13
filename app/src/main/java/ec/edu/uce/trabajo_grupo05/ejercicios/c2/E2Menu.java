package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E04FlipperActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E04FlipperActivityXml;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E04FlipperPauseActivity;

public class E2Menu extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] mActivities = new String[] {
            "** SensorPortrait ", "** Behind", "** SensorLandscape"};
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView list = new ListView(this);

        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mActivities);
        list.setAdapter(mAdapter);
        list.setOnItemClickListener(this);
        setContentView(list);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        Intent i;
        switch (position) {
            case 0:
                i = new Intent(this,E2FragmentPagerActivity1.class);
                break;
            case 1:
                i = new Intent(this,E2FragmentPagerActivity2.class);
                break;
            case 2:
                i = new Intent(this,E2FragmentPagerActivity.class);
                break;
            default:
                return;
        }
        startActivity(i);
    }
}
