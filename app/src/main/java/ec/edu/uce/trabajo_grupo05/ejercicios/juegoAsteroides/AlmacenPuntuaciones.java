package ec.edu.uce.trabajo_grupo05.ejercicios.juegoAsteroides;

import java.util.Vector;

public interface AlmacenPuntuaciones {

	public void guardarPuntuacion(int puntos, String nombre, long fecha);
	public Vector<String> listaPuntuaciones(int cantidad);
	
}
