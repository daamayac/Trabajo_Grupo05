package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;

public class E09SectionsActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView list = new ListView(this);

        E09SimpleSectionsAdapter<String> adapter = new E09SimpleSectionsAdapter<String>(
                list, /* Context for resource inflation */
                R.layout.activity_c1e9, /* Layout for header views */
                android.R.layout.simple_list_item_1 /* Layout for item views */
        ) {
            //Click handler for item taps
            @Override
            public void onSectionItemClick(String item) {
                Toast.makeText(E09SectionsActivity.this, item, Toast.LENGTH_SHORT).show();
            }
        };

        adapter.addSection("Fruits", new String[]{"Apples", "Oranges", "Bananas", "Mangos"});
        adapter.addSection("Vegetables", new String[]{"Carrots", "Peas", "Broccoli"});
        adapter.addSection("Meats", new String[]{"Pork", "Chicken", "Beef", "Lamb"});

        list.setAdapter(adapter);
        setContentView(list);
    }
}