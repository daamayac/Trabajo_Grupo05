package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util;

import android.database.sqlite.SQLiteDatabase;

/**
 * Used to obtain SQLite database to operate on.
 */
public interface SQLiteDataSource {

    SQLiteDatabase getSQLiteDatabase();

}
