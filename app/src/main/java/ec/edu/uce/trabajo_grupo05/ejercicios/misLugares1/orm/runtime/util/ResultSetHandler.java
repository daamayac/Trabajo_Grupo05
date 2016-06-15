package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util;

import android.database.Cursor;
import android.database.SQLException;

import java.util.List;


/**
 * Converts {@link Cursor} object into a list of Java objects.
 *
 * @param <T> type of the created object
 */
public interface ResultSetHandler<T> {
    /**
     * Creates an object from the current row in the specified {@link Cursor}.
     *
     * @param cursor SQLite query result
     * @return an object created from the current row in the specified {@link Cursor}
     * @throws SQLException if an exception is thrown when the object is created
     */
    List<T> getObjects(Cursor cursor) throws SQLException;
}
