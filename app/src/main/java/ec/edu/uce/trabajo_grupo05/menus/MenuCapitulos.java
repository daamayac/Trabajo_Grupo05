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

import ec.edu.uce.trabajo_grupo05.R;
import ec.edu.uce.trabajo_grupo05.ejercicios.juegoAsteroides.Asteroides;
import ec.edu.uce.trabajo_grupo05.ejercicios.misLugares2.ui.principal.PrincipalActivity;


public class MenuCapitulos extends AppCompatActivity {


    String[] caps = {"1. Layouts and Views", "2. User Interaction Recipes", "3. Communications and\n" +
            "Networking", "4. Interacting with Device Hardware and Media", "Capítulo 5", "Capítulo 6", "Juego Asteroides", "Mis Lugares 1", "Mis Lugares 2"};
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_capitulos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        list = (ListView) findViewById(R.id.listCapitulos);


        ArrayAdapter listCapAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, caps);
        list.setAdapter(listCapAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), C1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), C2.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), C3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), C4.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), Asteroides.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.MainActivity.class);

                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), PrincipalActivity.class);

                        startActivity(intent);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "En construcción", Toast.LENGTH_LONG).show();
                        break;
                }


                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main1, menu);
        return true;
    }


}
