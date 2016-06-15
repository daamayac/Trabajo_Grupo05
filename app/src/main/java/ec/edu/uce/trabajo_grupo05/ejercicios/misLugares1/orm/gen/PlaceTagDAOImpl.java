package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.gen;

public class PlaceTagDAOImpl
        extends  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.BaseDAO<PlaceTag>
        implements PlaceTagDAO {

    public PlaceTagDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public PlaceTagDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<PlaceTag> getPojoClass() {
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
    public java.util.List<PlaceTag> getPlaceTagList() {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public PlaceTag getByPlaceIdTagName(Integer placeId, String tagName) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(PLACE_ID.eq(placeId));
        lExps.add(TAG_NAME.eq(tagName));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<PlaceTag> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList(Place place) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(PLACE_ID.eq(place.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList(Place place,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(PLACE_ID.eq(place.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList(Place place,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(PLACE_ID.eq(place.getId()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList(Tag tag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(TAG_NAME.eq(tag.getName()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList(Tag tag,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(TAG_NAME.eq(tag.getName()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList(Tag tag,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(TAG_NAME.eq(tag.getName()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<PlaceTag> getPlaceTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<PlaceTag>
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
    public long insert(PlaceTag placeTag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(PLACE_ID, placeTag.getPlaceId());
        values.put(TAG_NAME, placeTag.getTagName());

        query.setValues(values);

        long id = insert(query);


        return id;
    }

    @Override
    public void insert(java.util.Collection<PlaceTag> placeTags) {
        for(PlaceTag obj : placeTags) {
            insert(obj);
        }
    }

    @Override
    public void update(PlaceTag placeTag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(PLACE_ID, placeTag.getPlaceId());
        values.put(TAG_NAME, placeTag.getTagName());

        query.setValues(values);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(PlaceTagDAO.PLACE_ID,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(placeTag.getPlaceId())));
        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(PlaceTagDAO.TAG_NAME,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(placeTag.getTagName())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<PlaceTag> placeTags) {
        for(PlaceTag obj : placeTags) {
            update(obj);
        }
    }

    @Override
    public void delete(PlaceTag placeTag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(PlaceTagDAO.PLACE_ID,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(placeTag.getPlaceId())));
        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(PlaceTagDAO.TAG_NAME,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(placeTag.getTagName())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        delete(query);
    }

    @Override
    public void delete(Integer placeId, String tagName) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(PLACE_ID.eq(placeId));
        lExps.add(TAG_NAME.eq(tagName));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);
        delete(query);
    }

    @Override
    public void delete(java.util.Collection<PlaceTag> placeTags) {
        for(PlaceTag obj : placeTags) {
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
