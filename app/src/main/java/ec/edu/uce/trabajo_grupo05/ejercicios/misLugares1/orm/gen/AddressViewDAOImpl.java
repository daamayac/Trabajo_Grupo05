package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.gen;

public class AddressViewDAOImpl
        extends  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.BaseDAO<AddressView>
        implements AddressViewDAO {

    public AddressViewDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public AddressViewDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<AddressView> getPojoClass() {
        return POJO_CLASS;
    }

    @Override
    public  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.TableExpression getTableExpression() {
        return TABLE_EXPRESSION;
    }

    @Override
    public  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.ResultSetHandler getResultSetHandler() {
        return RESULT_SET_HANDLER;
    }

    @Override
    public java.util.List<AddressView> getAddressViewList() {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<AddressView>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<AddressView> getAddressViewList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<AddressView>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<AddressView> getAddressViewList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<AddressView>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<AddressView> getAddressViewList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<AddressView>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<AddressView> getAddressViewList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<AddressView>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<AddressView> getAddressViewList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<AddressView>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Long getCount() {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.fun("COUNT",
                         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.ASTERISK));
        java.util.List<Long> list = select(query, new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.handlers.LongResultSetHandler()).getObjectList();
        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            throw new RuntimeException("Cannot retrieve count() method result");
        }
    }

    @Override
    public Long getCount( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.fun("COUNT",
                         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.ASTERISK));
        query.setWhere(where);
        java.util.List<Long> list = select(query, new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.handlers.LongResultSetHandler()).getObjectList();
        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            throw new RuntimeException("Cannot retrieve count() method result");
        }
    }

}
