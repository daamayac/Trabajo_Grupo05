package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.gen;

public class PlaceDAOImpl
        extends  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.BaseDAO<Place>
        implements PlaceDAO {

    public PlaceDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public PlaceDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<Place> getPojoClass() {
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
    public java.util.List<Place> getPlaceList() {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Place>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Place>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Place>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Place getById(Integer id) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(ID.eq(id));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Place> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Place getPlace(PlaceTag placeTag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(ID.eq(placeTag.getPlaceId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Place> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Place getPlace(Address address) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(ADDRESS_ID.eq(address.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Place> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Place>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Place>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Place>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public byte[] getImage(Place place) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION, IMAGE);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(ID.eq(place.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);
        java.util.List<byte[]> list = select(query, new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.BlobResultSetHandler()).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public void setImage(Place place, byte[] blob) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement(TABLE_EXPRESSION);

        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(IMAGE, blob);
        query.setValues(values);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(PlaceDAO.ID,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(place.getId())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
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
    public long insert(Place place) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(ID, place.getId());
        values.put(NAME, place.getName());
        values.put(ADDRESS_ID, place.getAddressId());
        values.put(RATING, place.getRating());
        values.put(ADDED, place.getAdded());
        values.put(COMMENT, place.getComment());

        values.put(IMAGE, null);
        query.setValues(values);

        long id = insert(query);

        place.setId(new Long(id).intValue());

        return id;
    }

    @Override
    public void insert(java.util.Collection<Place> places) {
        for(Place obj : places) {
            insert(obj);
        }
    }

    @Override
    public void update(Place place) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(ID, place.getId());
        values.put(NAME, place.getName());
        values.put(ADDRESS_ID, place.getAddressId());
        values.put(RATING, place.getRating());
        values.put(ADDED, place.getAdded());
        values.put(COMMENT, place.getComment());

        query.setValues(values);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(PlaceDAO.ID,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(place.getId())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<Place> places) {
        for(Place obj : places) {
            update(obj);
        }
    }

    @Override
    public void delete(Place place) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(PlaceDAO.ID,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(place.getId())));
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
    public void delete(java.util.Collection<Place> places) {
        for(Place obj : places) {
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
