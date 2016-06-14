package ec.edu.uce.trabajo_grupo05.ejercicios.juegoAsteroides;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import ec.edu.uce.trabajo_grupo05.R;

public class VistaJuego extends View implements SensorEventListener {

	// CONFIG ///////////////////////////
	private SharedPreferences pref;
	private Vector<Grafico> asteroides;
	private Vector<Misil> misiles;
	private Drawable fondo1;
	private Drawable drawableNave;
	private Drawable drawableAsteroide[];
	private int numAsteroides = 5; // Numero inicial de asteroides
	private int numMisiles = 10; // numero de misiles
	private int numFragmentos;
	private boolean musica;
	private int puntuacion = 0;
	private Activity padre;

	// /////// NAVE ////////////////////////
	private Grafico nave;
	private int giroNave;
	private float aceleracionNave;

	// ////// MISIL ///////////////////////
	// Misil misil;
	Iterator vecInterator;

	// Incremento de giro y aceleración
	private static final int PASO_GIRO_NAVE = 5;
	private static final float PASO_ACELERACION_NAVE = 0.5f;

	private float mX = 0, mY = 0;
	private boolean disparo = false;

	// ////////// THREAD Y TIEMPO //////////////////
	// Hilo de ejecución del juego
	private ThreadJuego hilo = new ThreadJuego();
	// Cada cuánto queremos actualizar los cambios
	private static int PERIODO_PROCESO = 50;
	// cuándo se realizo el último proceso: 'delta Time'
	private long ultimoProceso = 0;

	// VALORES SENSORES ///////////
	SensorManager sm;
	private boolean isValorInicial;
	private float valorInicial;
	private boolean sensorActivo = false;

	// MULTIMEDIA /////////////////
	SoundPool soundPool;
	int idDisparo, idExplosion;

	public VistaJuego(Context context, AttributeSet attrs) {
		super(context, attrs);
		// estableciendo preferencias
		pref = PreferenceManager.getDefaultSharedPreferences(context);
		numFragmentos = Integer.valueOf(pref.getString("fragmentos", "3"));
		musica = pref.getBoolean("musica", true);



		Resources res = context.getResources();
		asteroides = new Vector<Grafico>();
		misiles = new Vector<Misil>();
		fondo1 = res.getDrawable(R.drawable.grid);
		drawableAsteroide = new Drawable[3];
		// iniciamos los bitmaps de los tres tipo de asteroides
		drawableAsteroide[0] = res.getDrawable(R.drawable.asteroide1);
		drawableAsteroide[1] = res.getDrawable(R.drawable.asteroide2);
		drawableAsteroide[2] = res.getDrawable(R.drawable.asteroide3);

		res.getDrawable(R.drawable.asteroide1);
		for (int i = 0; i < numAsteroides; i++) {
			Grafico asteroide = new Grafico(this, drawableAsteroide[0]);

			asteroide.setIncX(Math.random() * 4 - 2); // rango de -2 a 2 //
														// (velocidad)
			asteroide.setIncY(Math.random() * 4 - 2);
			asteroide.setAngulo((int) (Math.random() * 360));
			asteroide.setRotacion((int) (Math.random() * 8 - 4));
			asteroides.add(asteroide);
		}
		nave = new Grafico(this, res.getDrawable(R.drawable.nave));
		// Creación de misiles
		for (int i = 0; i < numMisiles; i++) {
			Misil misil = new Misil(this, res.getDrawable(R.drawable.misil1));
			misiles.add(misil);
		}
		vecInterator = misiles.iterator();

		// Registramos el sensor e indicamos qué objeto recogerá la llamada
		// callback
		sm = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
		regSensorOrientacion();

		// Iniciamos el SoundPool y los disparos
		if (musica) {
			soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
			idDisparo = soundPool.load(context, R.raw.disparo, 0);
			idExplosion = soundPool.load(context, R.raw.explosion, 0);
		}

	}

	@Override
	protected void onSizeChanged(int ancho, int alto, int anchoAnterior,
			int altoAnterior) {

		super.onSizeChanged(ancho, alto, anchoAnterior, altoAnterior);

		fondo1.setBounds(0, 0, ancho, alto);
		for (Grafico asteroide : asteroides) {
			do {
				// evita que los asteroides coincidan con la nave al inicio
				asteroide.setPosX(Math.random()
						* (ancho - asteroide.getAncho()));
				asteroide.setPosY(Math.random() * (alto - asteroide.getAlto()));
			} while (nave.verificarColision(asteroide));

		}

		nave.setPosX(ancho / 2);
		nave.setPosY(alto / 2);

		ultimoProceso = System.currentTimeMillis();
		hilo.start();

	}

	@Override
	protected synchronized void onDraw(Canvas canvas) {

		super.onDraw(canvas);
		fondo1.draw(canvas);
		for (Grafico asteroide : asteroides) {
			asteroide.dibujaGrafico(canvas);
		}

		nave.dibujaGrafico(canvas);
		for (Misil misil : misiles) {
			if (misil.isMisilActivo()) {
				misil.dibujaGrafico(canvas);
			}
		}

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		super.onTouchEvent(event);
		try {
			Thread.sleep(60);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		float x = event.getX();
		float y = event.getY();
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			disparo = true;
			break;
		case MotionEvent.ACTION_MOVE:
			float dx= Math.abs(x - mX);
			float dy= Math.abs(y - mY);
			if (dy < 6 && dx > 6) {
				giroNave = Math.round((x - mX) / 25);
				disparo = false;
			} else if (dx < 6 && dy > 6) {
				aceleracionNave = Math.round((mY - y) / 25);
				disparo = false;
			}
			break;
		case MotionEvent.ACTION_UP:
			giroNave = 0;
			aceleracionNave = 0;
			if (disparo) {
				// Disparo de varios misiles en pantalla
				while (vecInterator.hasNext()) {
					Misil misil = (Misil) vecInterator.next();
					if (!misil.isMisilActivo()) {
						activaMisil(misil);
						break;
					}

				}

			}
			break;
		default:
			break;
		}
		mX = x;
		mY = y;
		return true;

	}

	protected synchronized void actualizarFisica() {

		long ahora = System.currentTimeMillis();
		// No hacer nada si el periodo de proceso no se ha cumplido
		if (ahora < ultimoProceso + PERIODO_PROCESO) {
			return;
		}

		// Para una ejecución en tiempo real calculamos retardo
		double retardo = (ahora - ultimoProceso) / PERIODO_PROCESO;
		ultimoProceso = ahora; // Para la próxima vez
		// actualizamos velocidad y dirección de la nave a partir
		// de giroNave y aceleracionNave (según la entrada del usuario)
		nave.setAngulo((int) (nave.getAngulo() + giroNave * retardo));
		double nIncX = nave.getIncX() + aceleracionNave
				* Math.cos(Math.toRadians(nave.getAngulo())) * retardo;
		double nIncY = nave.getIncY() + aceleracionNave
				* Math.sin(Math.toRadians(nave.getAngulo())) * retardo;

		if (Math.hypot(nIncX, nIncY) <= Grafico.getMaxVelocidad()) {
			nave.setIncX(nIncX);
			nave.setIncY(nIncY);
		}
		// Incrementamos la posición de la nave y de los asteroides y
		// verificamos colisiones
		nave.incrementaPos(retardo);
		for (Grafico asteroide : asteroides) {
			asteroide.incrementaPos(retardo);
			if (nave.verificarColision(asteroide))
				salir();
		}

		// Actualizamos posición del misil //////
		for (Misil misil : misiles) {
			if (misil.isMisilActivo()) {
				misil.incrementaPos(retardo);

				misil.setTiempoMisil(misil.getTiempoMisil() - (int) retardo);
				if (misil.getTiempoMisil() < 0) {
					misil.setMisilActivo(false);
				} else {
					for (int i = 0; i < asteroides.size(); i++) {
						if (misil.verificarColision(asteroides.elementAt(i))) {
							destruyeAsteroide(i, misil);
							break;
						}
					}
				}
			}
		}
	}

	private void destruyeAsteroide(int i, Misil misil) {
		if (asteroides.get(i).getDrawable() == drawableAsteroide[2])
			asteroides.remove(i);

		int tam;
		if (asteroides.get(i).getDrawable() != drawableAsteroide[2]) {

			if (asteroides.get(i).getDrawable() == drawableAsteroide[1]) {
				tam = 2;
			} else {
				tam = 1;
			}

			for (int n = 0; n < numFragmentos; n++) {
				Grafico asteroide = new Grafico(this, drawableAsteroide[tam]);
				asteroide.setPosX(asteroides.get(i).getPosX());
				asteroide.setPosY(asteroides.get(i).getPosY());
				asteroide.setIncX(Math.random() * 7 - 2 - tam);
				asteroide.setIncY(Math.random() * 7 - 2 - tam);
				asteroide.setAngulo((int) (Math.random() * 360));
				asteroide.setRotacion((Math.random() * 8 - 4));
				asteroides.add(asteroide);
			}

			if (asteroides.isEmpty())
				salir();

		}

		// Desactivamos el misil para que el método onDraw deje de dibujarlo
		misil.setMisilActivo(false);
		if (soundPool != null)
			soundPool.play(idExplosion, 1, 1, 0, 0, 1);

		puntuacion += 1000;

	}

	private void activaMisil(Misil misil) {
		// centramos el misil atendiendo a la posición, altura y anchura de la
		// nave

		misil.setPosX(nave.getPosX() + nave.getAncho() / 2 - misil.getAncho()
				/ 2);
		misil.setPosY(nave.getPosY() + nave.getAlto() / 2 - misil.getAlto() / 2);

		misil.setAngulo(nave.getAngulo());
		misil.setIncX(Math.cos(Math.toRadians(misil.getAngulo()))
				* Misil.PASO_VELOCIDAD_MISIL);
		misil.setIncY(Math.sin(Math.toRadians(misil.getAngulo()))
				* Misil.PASO_VELOCIDAD_MISIL);
		/*
		 * Damos un tiempo de vida al misil para que no esté recorriendo
		 * permanentemente la pantalla hasta chocar con un asteroide. Nos
		 * quedamos con el mínimo entre el ancho dividido por la velocidad y el
		 * alto dividido por la velocidad y le restamos una constante
		 */

		misil.setTiempoMisil((int) Math.min(
				this.getWidth() / Math.abs(misil.getIncX()), this.getHeight()
						/ Math.abs(misil.getIncY()))
				- Misil.TIEMPO_VIDA);

		misil.setMisilActivo(true);
		if (soundPool != null)
			soundPool.play(idDisparo, 1, 1, 1, 0, 1);

	}

	private void salir() {
		Bundle bundle = new Bundle();
		bundle.putInt("puntuacion", puntuacion);
		Intent returnIntent = new Intent();
		returnIntent.putExtras(bundle);
		padre.setResult(Activity.RESULT_OK, returnIntent);
		padre.finish();
	}

	class ThreadJuego extends Thread {

		private boolean pausa, corriendo;

		public synchronized void pausar() {
			pausa = true;
		}

		public synchronized void reanudar() {
			pausa = false;
			notify();
		}

		public void detener() {
			corriendo = false;
			if (pausa)
				reanudar();
		}

		@Override
		public void run() {
			corriendo = true;
			while (corriendo) {
				actualizarFisica();
				synchronized (this) {
					while (pausa) {
						try {
							// Detenemos la actividad cuando ésta entre en pausa
							wait();
						} catch (Exception e) {

						}
					}
				}
			}

		}

	}

	// Métodos para habilitar los sensores de orientación
	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {

		this.isValorInicial = false;

	}

	// Registro del sensor
	public boolean regSensorOrientacion() {
		List<Sensor> listaSensores = sm.getSensorList(Sensor.TYPE_ORIENTATION);
		if (!listaSensores.isEmpty()) {
			Sensor sensorOrientacion = listaSensores.get(0);
			sm.registerListener(this, sensorOrientacion, sm.SENSOR_DELAY_GAME);
			return sensorActivo = true;
		} else
			return sensorActivo;

	}

	// Desactivar sensor
	public boolean stopSensorOrientacion() {
		if (sensorActivo) {
			sm.unregisterListener(this);
			sensorActivo = false;
		}
		return sensorActivo;
	}

	// Método implementado de la interfaz SensorEventListener
	@Override
	public void onSensorChanged(SensorEvent event) {
		float valor = event.values[1];
		if (!isValorInicial) {
			valorInicial = valor;
			isValorInicial = true;
		}
		giroNave = (int) (( valorInicial-valor) / 3);
	}

	// Método getter de ThreadJuego para controlar el hilo fuera de VistaJuego
	public ThreadJuego getHilo() {
		return hilo;
	}

	public void setPadre(Activity padre) {
		this.padre = padre;
	}
	
}
