package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares2.ui.principal;

import android.database.Cursor;

/**
 * Interfaz de los fragments que componen las pestañas de la actividad principal
 */
public interface PrincipalActivityFragment {

    /**
     * Notifica al fragment que debe actualizarse con nueva informacion
     *
     * @param data
     */
    void notififyDataChanged(Cursor data);
}
