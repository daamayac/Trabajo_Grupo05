package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1;

import android.content.Context;

import ec.edu.uce.trabajo_grupo05.R;
import ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SimpleSQLiteOpenHelper;


/**
 * Using provided by Vertabelo Mobile ORM SimpleSQLiteOpenHelper.
 *
 */
public class DatabaseOpenHelper extends SimpleSQLiteOpenHelper {

    protected static final String DB_NAME = "places";
    protected static final Integer VERSION = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, DB_NAME, VERSION);
    }

    @Override
    public void configure() {
        this.addCreationScript(R.raw.create);
    }
}
