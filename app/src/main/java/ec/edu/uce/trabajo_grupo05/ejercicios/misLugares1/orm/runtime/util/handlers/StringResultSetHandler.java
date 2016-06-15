package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.handlers;

import android.database.Cursor;
import android.database.SQLException;

import  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.ResultSetHandler;

import java.util.LinkedList;
import java.util.List;

/**
 * Converts first column of every row in cursor into List<String>.
 */
public class StringResultSetHandler implements ResultSetHandler<String> {
    @Override
    public List<String> getObjects(Cursor cursor) throws SQLException {
        List<String> ret = new LinkedList<String>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            ret.add(cursor.getString(0));
            cursor.moveToNext();
        }
        return ret;
    }
}
