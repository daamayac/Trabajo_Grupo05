package ec.edu.uce.trabajo_grupo05.menus;

import android.content.Intent;
import android.os.Bundle;
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
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E19ActionTabsActivity;

public class C2 extends AppCompatActivity {
    String[] ejer = {"Ejercicio 1","Ejercicio 2","Ejercicio 3","Ejercicio 4","Ejercicio 5","Ejercicio 6",
            "Ejercicio 7","Ejercicio 8","Ejercicio 9","Ejercicio 10","Ejercicio 11","Ejercicio 12","Ejercicio 12",
            "Ejercicio 14","Ejercicio 15","Ejercicio 16","Ejercicio 17","Ejercicio 18","Ejercicio 19",};
    ListView list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        list = (ListView) findViewById(R.id.listCap2);


        ArrayAdapter listCapAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ejer);
        list.setAdapter(listCapAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=null;
                switch (position){
                    case 18:
                        intent= new Intent(getApplicationContext(),E19ActionTabsActivity.class);
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
