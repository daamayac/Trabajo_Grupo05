package ec.edu.uce.trabajo_grupo05.menus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E01StylesActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E01ThemedActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E02MainActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E03MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E04AnimateActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E04MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E05MainActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E06UniversalActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E07EmptyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E08MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E09SectionsActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E10MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E11MainActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E11MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c1.E12Main;

public class C1 extends AppCompatActivity {

    String[] ejer = {"1.1 Styling Common Components 1","1.2 Styling Common Components ","2. Toggling System UI Elements","3. Creating and Displaying Views","4.1 Animating a View ","4.2 Animating a View ","5. Animating Layout Changes",
            "6. Implementing Situation-Specific Layouts","7. Customizing AdapterView Empty Views","8. Customizing ListView Rows","9. Making ListView Section Headers","10. Creating Compound Controls","11. Customizing Transition Animations","12.Creating View Transformations","13.Making Extensible Collection Views"};
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
                    case 7:
                        intent= new Intent(getApplicationContext(),E06UniversalActivity.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent= new Intent(getApplicationContext(),E07EmptyActivity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent= new Intent(getApplicationContext(),E08MyActivity.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent= new Intent(getApplicationContext(),E09SectionsActivity.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent= new Intent(getApplicationContext(),E10MyActivity.class);
                        startActivity(intent);
                        break;
                    case 12:
                        intent= new Intent(getApplicationContext(),E11MyActivity.class);
                        startActivity(intent);
                        break;
                    case 13:
                        intent= new Intent(getApplicationContext(),E12Main.class);
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
