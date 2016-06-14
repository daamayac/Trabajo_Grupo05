package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

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

public class E083MyActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] mActivities = new String[] {
            "XmlPull Feed", "XmlPull Resource","Xml SAX"};
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
                i = new Intent(this, PullFeedActivity.class);
                break;
            case 1:
                i = new Intent(this, PullParserActivity.class);
                break;
            case 2:
                i = new Intent(this, ec.edu.uce.trabajo_grupo05.ejercicios.c3.xmlsax.FeedActivity.class);
                break;
            default:
                return;
        }
        startActivity(i);
    }
}
