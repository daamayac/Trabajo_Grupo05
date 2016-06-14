package ec.edu.uce.trabajo_grupo05.menus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E5ActionActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E13BeamActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E13Menu;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E13NfcActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E2DisplayingWebInformation;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E1WebViewEvents;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E3JavaScript;
import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E5DownloadActivity;


public class C3 extends AppCompatActivity {
    String[] ejer = {"3.1 Displaying Web Information ", "3.2 WebViewEvents","3.3 JavaScript","3.5 Downloading Completely in the Background","3.6 REST","3.7 JSON","3.8  Parsing XML", "3.9. Receiving SMS","3.10.Sending an SMS Message","3.11. Communicating over Bluetooth",
            "3.12. Querying Network Reachability","3.13. Transferring Data with NFC","3.14. Connecting over USB"};

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        list = (ListView) findViewById(R.id.listCap3);

        ArrayAdapter listCapAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ejer);
        list.setAdapter(listCapAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), E1WebViewEvents.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), E2DisplayingWebInformation.class);
                        break;

                    case 2:
                        intent = new Intent(getApplicationContext(), E3JavaScript.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), E5DownloadActivity.class);
                        break;
                    case 4:
                       // intent = new Intent(getApplicationContext(), E5DownloadActivity.class);
                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                        break;
                    case 10:

                        break;
                    case 11:
                        intent = new Intent(getApplicationContext(), E13Menu.class);
                        break;
                    case 12:


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
