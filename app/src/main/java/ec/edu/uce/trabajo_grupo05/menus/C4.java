package ec.edu.uce.trabajo_grupo05.menus;


import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E083MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E13Menu;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E1WebViewEvents;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E2DisplayingWebInformation;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E3JavaScript;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E5DownloadActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E6SearchActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E7Json;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.ExchangeActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.SmsActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.USBActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c4.E10Menu;
import ec.edu.uce.trabajo_grupo05.ejercicios.c4.E4MainActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c4.E9RecognizeActivity;

/**
 * Created by User on 02/07/2016.
 */
public class C4 extends AppCompatActivity {
    String[] ejer = {"4.1 Integrating Device Location ", "4.2 y 4.3 Annotating Maps","4.4 Monitoring Location Regions",
            "4.5 Capturing Images and Video","4.6 Making a Custom Camera Overlay","4.7 Recording Audio","4.8  Capturing Custom Video",
            "4.9. Adding Speech Recognition","4.10.  Playing Back Audio/Video",
            "4.11. Playing Sound Effects","4.12. Creating a Tilt Monitor","4.13.Monitoring Compass Orientation",
            "4.14. Retrieving Metadata from Media Content", "4.15. Detecting User Motion"};

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        list = (ListView) findViewById(R.id.listCap4);

        ArrayAdapter listCapAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ejer);
        list.setAdapter(listCapAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch (position) {
                    case 0:
                      //  intent = new Intent(getApplicationContext(), E1WebViewEvents.class);
                        break;
                    case 1:
                        //intent = new Intent(getApplicationContext(), E2DisplayingWebInformation.class);
                        break;

                    case 2:
                        intent = new Intent(getApplicationContext(), E4MainActivity.class);
                        break;
                    case 3:
                        // intent = new Intent(getApplicationContext(), E5DownloadActivity.class);
                        break;
                    case 4:
                       // intent = new Intent(getApplicationContext(), E6SearchActivity.class);
                        break;
                    case 5:
                        // intent = new Intent(getApplicationContext(), E7Json.class);

                        break;
                    case 6:
                        // intent = new Intent(getApplicationContext(), E083MyActivity.class);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), E9RecognizeActivity.class);
                        break;
                    case 8:
                         intent = new Intent(getApplicationContext(), E10Menu.class);
                        break;
                    case 9:
                        // intent = new Intent(getApplicationContext(), ec.edu.uce.trabajo_grupo05.ejercicios.c3.Reachability.class);
                        break;
                    case 10:
                        // intent = new Intent(getApplicationContext(), E13Menu.class);

                        break;
                    case 11:
                        //  intent = new Intent(getApplicationContext(), USBActivity.class);
                        break;
                    case 12:
                        //  intent = new Intent(getApplicationContext(), USBActivity.class);
                        break;

                    case 13:
                        //  intent = new Intent(getApplicationContext(), USBActivity.class);
                        break;

                    default:
                        Toast.makeText(getApplicationContext(), "En construcción", Toast.LENGTH_LONG).show();
                        break;


                }

                startActivity(intent);
                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();

            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}

