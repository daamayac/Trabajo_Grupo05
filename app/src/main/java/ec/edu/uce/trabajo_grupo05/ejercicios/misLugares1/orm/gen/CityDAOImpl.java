package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.gen;

public class CityDAOImpl
        extends  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.BaseDAO<City>
        implements CityDAO {

    public CityDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public CityDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<City> getPojoClass() {
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
    public java.util.List<City> getCityList() {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<City> getCityList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<City> getCityList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public City getById(Integer id) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(ID.eq(id));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<City> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public City getByCountryIdName(Integer countryId, String name) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(COUNTRY_ID.eq(countryId));
        lExps.add(NAME.eq(name));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<City> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public City getCity(Address address) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(ID.eq(address.getCityId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<City> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<City> getCityList(Country country) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(COUNTRY_ID.eq(country.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<City> getCityList(Country country,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(COUNTRY_ID.eq(country.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<City> getCityList(Country country,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(COUNTRY_ID.eq(country.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<City> getCityList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<City> getCityList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<City> getCityList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<City>
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

    @Override
    public long insert(City city) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(ID, city.getId());
        values.put(COUNTRY_ID, city.getCountryId());
        values.put(NAME, city.getName());

        query.setValues(values);

        long id = insert(query);

        city.setId(new Long(id).intValue());

        return id;
    }

    @Override
    public void insert(java.util.Collection<City> citys) {
        for(City obj : citys) {
            insert(obj);
        }
    }

    @Override
    public void update(City city) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(ID, city.getId());
        values.put(COUNTRY_ID, city.getCountryId());
        values.put(NAME, city.getName());

        query.setValues(values);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(CityDAO.ID,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(city.getId())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<City> citys) {
        for(City obj : citys) {
            update(obj);
        }
    }

    @Override
    public void delete(City city) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(CityDAO.ID,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(city.getId())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        delete(query);
    }

    @Override
    public void delete(Integer id) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(ID.eq(id));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);
        delete(query);
    }

    @Override
    public void delete(java.util.Collection<City> citys) {
        for(City obj : citys) {
            delete(obj);
        }
    }

    @Override
    public void delete( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        query.setWhere(where);

        delete(query);
    }
}
