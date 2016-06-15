package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.handlers;

import android.database.Cursor;
import android.database.SQLException;

import  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.ResultSetHandler;

import java.util.LinkedList;
import java.util.List;

/**
 * Converts first column of every row in cursor into List<Float>.
 */
public class FloatResultSetHandler implements ResultSetHandler<Float> {
    @Override
    public List<Float> getObjects(Cursor cursor) throws SQLException {
        List<Float> ret = new LinkedList<Float>();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            ret.add(cursor.getFloat(0));
            cursor.moveToNext();
        }
        return ret;
    }
}
