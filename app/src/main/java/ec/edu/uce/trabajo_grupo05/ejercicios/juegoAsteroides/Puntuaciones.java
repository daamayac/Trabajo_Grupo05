package ec.edu.uce.trabajo_grupo05.ejercicios.juegoAsteroides;

import android.app.ListActivity;
import android.os.Bundle;

import ec.edu.uce.trabajo_grupo05.R;

public class Puntuaciones extends ListActivity {
	
	AlmacenPuntuacionesPreferencias almacen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		almacen = new AlmacenPuntuacionesPreferencias(this);
		setContentView(R.layout.puntuaciones);
		// asociar un layout definido a nuestro ListView
		setListAdapter(new MiAdaptador(this, almacen.listaPuntuaciones(10)));
	}

}
