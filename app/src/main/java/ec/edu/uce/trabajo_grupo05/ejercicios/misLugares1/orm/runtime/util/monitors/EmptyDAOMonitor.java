package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.monitors;


import java.util.List;

import ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.DAO;
import ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Value;
import ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.DAOMonitor;

/**
 * DAO monitor which does not log any information.
 */
public class EmptyDAOMonitor implements DAOMonitor {

    /**
     * Constructor.
     */
    public EmptyDAOMonitor() { }

    @Override
    public void delete(DAO<?> dao, String deleteStatement, List<Value> parameters) {
    }

    @Override
    public void insert(DAO<?> dao, String insertStatement, List<Value> parameters) {
    }

    @Override
    public void selectObjectList(DAO<?> dao, String queryString, List<Value> parameters) {
    }

    @Override
    public void update(DAO<?> dao, String updateStatement, List<Value> parameters) {
    }

}
