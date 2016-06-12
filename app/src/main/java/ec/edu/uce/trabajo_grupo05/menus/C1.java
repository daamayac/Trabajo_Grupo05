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
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E01StylesActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E01ThemedActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E02MainActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E03MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E04AnimateActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E04MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E05MainActivity;

public class C1 extends AppCompatActivity {

    String[] ejer = {"Ejercicio 1-1","Ejercicio 1-2","Ejercicio 2","Ejercicio 3","Ejercicio 4-1","Ejercicio 4-2","Ejercicio 5",
            "Ejercicio 6","Ejercicio 7","Ejercicio 8","Ejercicio 9","Ejercicio 10"};
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
                        intent= new Intent(getApplicationContext(),E01StylesActivity.class);
                        startActivity(intent);
                        break;

                    case 1:
                        intent= new Intent(getApplicationContext(), E01ThemedActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent= new Intent(getApplicationContext(),E02MainActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent= new Intent(getApplicationContext(),E03MyActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent= new Intent(getApplicationContext(),E04MyActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent= new Intent(getApplicationContext(),E04AnimateActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent= new Intent(getApplicationContext(),E05MainActivity.class);
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
