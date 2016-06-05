package ec.edu.uce.trabajo_grupo05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import ec.edu.uce.trabajo_grupo05.menus.MenuCapitulos;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

    }

    @Override
   public boolean onCreateOptionsMenu(Menu menu) {
    //Inflate the menu; this adds items to the action bar if it is present.
     getMenuInflater().inflate(R.menu.menu_main, menu);
   return true;
   }

    //
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
     //Handle action bar item clicks here. The action bar will
     //automatically handle clicks on the Home/Up button, so long
     //as you specify a parent activity in AndroidManifest.xml.
      int id = item.getItemId();

       //noinspection SimplifiableIfStatement
      if (id == R.id.acerda_de) {
         Intent intent = new Intent(this,AcerdaDe.class);
          startActivity(intent);
     }else if(id == R.id.capitulos){

          Intent intent = new Intent(this,MenuCapitulos.class);
          startActivity(intent);
      }

        return super.onOptionsItemSelected(item);
    }
}
