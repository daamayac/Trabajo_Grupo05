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
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E10Activity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E10CurrencyTextWatcher;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E10MyActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E11CustomIME;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E13PanScrollActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E14DelegateActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E14RemoteScrollActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E15DisallowActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E16DragTouchActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E17SupportActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E17ToolbarActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E18FragmentPagerActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E18PagerActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E19ActionTabsActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E1SupportActionActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E1SupportToolbarActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E2FragmentPagerActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E2Menu;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E3LockActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E4ManualRotationActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E5ActionActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E6CustomItemActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E6DialogActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E7OptionsActivity;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E8MenuAction;
import ec.edu.uce.trabajo_grupo05.ejercicios.c2.E9CustomBack;

public class C2 extends AppCompatActivity {
    String[] ejer = {"1 Leveraging the Action Bar", "2 Locking Activity Orientation", "3 Performing Dynamic Orientation Locking",
            "4 Manually Handling Rotation", "5 Creating Contextual Actions", "6 Displaying a User Dialog Box",
            "7 Customizing Menus and Actions", "8 Customizing  BACK Behavior", "9 Emulating the HOME Button",
            "10 Monitoring TextView Changes", "11 Customizing Keyboard Actions", "12 Dismissing the Soft Keyboard",
            "13 Handling Complex Touch Events", "14 Forwarding Touch Events", "13-14  Touch EventsCustom ",
            "15  Making Drag-and-Drop Views ", "16  Making Drag-and-Drop Views ", "17.1 Building a Navigation Drawer",
            "17.2 Building a Navigation Drawer", "18.1 Swiping Between Views", "18.2 Swiping Between Views",
            "19 Navigating with Tabs",};
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        list = (ListView) findViewById(R.id.listCap2);


        ArrayAdapter listCapAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, ejer);
        list.setAdapter(listCapAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;
                switch (position) {
                    case 0:
                        intent = new Intent(getApplicationContext(), E1SupportActionActivity.class);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(), E2Menu.class);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(), E3LockActivity.class);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(), E4ManualRotationActivity.class);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(), E5ActionActivity.class);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(), E6DialogActivity.class);
                        break;
                    case 6:
                        intent = new Intent(getApplicationContext(), E7OptionsActivity.class);
                        break;
                    case 7:
                        intent = new Intent(getApplicationContext(), E8MenuAction.class);
                        break;
                    case 8:
                        intent = new Intent(getApplicationContext(), E9CustomBack.class);
                        break;
                    case 9:
                        intent = new Intent(getApplicationContext(), E10Activity.class);
                        break;
                    case 10:
                        intent = new Intent(getApplicationContext(), E11CustomIME.class);
                        break;
                    case 12:
                        intent= new Intent(getApplicationContext(),E13PanScrollActivity.class);

                        break;
                    case 11:
                        intent= new Intent(getApplicationContext(),MenuCapitulos.class);

                        break;
                    case 13:
                        intent= new Intent(getApplicationContext(),E14DelegateActivity.class);

                        break;
                    case 14:
                        intent= new Intent(getApplicationContext(),E14RemoteScrollActivity.class);

                        break;
                    case 15:
                        intent = new Intent(getApplicationContext(), E15DisallowActivity.class);
                        break;
                    case 16:
                        intent = new Intent(getApplicationContext(), E16DragTouchActivity.class);
                        break;
                    case 17:
                        intent = new Intent(getApplicationContext(), E17SupportActivity.class);
                        break;
                    case 18:
                        intent = new Intent(getApplicationContext(), E17ToolbarActivity.class);
                        break;
                    case 19:
                        intent = new Intent(getApplicationContext(), E18PagerActivity.class);
                        break;
                    case 20:
                        intent = new Intent(getApplicationContext(), E18FragmentPagerActivity.class);
                        break;
                    case 21:
                        intent = new Intent(getApplicationContext(), E19ActionTabsActivity.class);
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
