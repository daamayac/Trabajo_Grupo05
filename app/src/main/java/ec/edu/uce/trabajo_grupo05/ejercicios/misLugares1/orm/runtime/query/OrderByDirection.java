package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query;

/**
 * Type representing direction in ORDER BY clause.
 */
public enum OrderByDirection {
    ASC,
    DESC;

    @Override
    public String toString() {
        switch (this) {
            case ASC:
                return " ASC";
            case DESC:
                return " DESC";
            default:
                throw new IllegalStateException();
        }
    }
}
