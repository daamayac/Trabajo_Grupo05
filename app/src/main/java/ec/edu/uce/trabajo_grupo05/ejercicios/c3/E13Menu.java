package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E2FragmentPagerActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E2FragmentPagerActivity1;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E2FragmentPagerActivity2;

public class E13Menu extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] mActivities = new String[] {
            "BeamActivity ", "NfcActivuty"};
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
                i = new Intent(this,E13BeamActivity.class);
                break;
            case 1:
                i = new Intent(this,E13NfcActivity.class);
                break;

            default:
                return;
        }
        startActivity(i);
    }
}
