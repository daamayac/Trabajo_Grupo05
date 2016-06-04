package ec.edu.uce.trabajo_grupo05.menus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.MainActivity;
import ec.edu.uce.trabajo_grupo05.R;

public class C1 extends AppCompatActivity {

    String[] ejer = {"Ejercicio 1"};
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        list = (ListView) findViewById(R.id.listCap1);


        ArrayAdapter listCapAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ejer);
        list.setAdapter(listCapAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=null;
                switch (position){
                    case 0:
                        intent= new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                        break;

                    default:
                        Toast.makeText(getApplicationContext(),"En construcción",Toast.LENGTH_LONG).show();
                        break;

                }


                Toast.makeText(getApplicationContext(),parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }




}
