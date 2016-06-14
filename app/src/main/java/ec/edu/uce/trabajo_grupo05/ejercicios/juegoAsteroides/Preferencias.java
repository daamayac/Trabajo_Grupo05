package ec.edu.uce.trabajo_grupo05.ejercicios.juegoAsteroides;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import ec.edu.uce.trabajo_grupo05.R;

public class Preferencias extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferencias);
	}
	
	

}
