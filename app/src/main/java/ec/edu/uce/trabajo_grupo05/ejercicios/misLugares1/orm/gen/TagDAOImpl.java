package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.gen;

public class TagDAOImpl
        extends  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.BaseDAO<Tag>
        implements TagDAO {

    public TagDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource) {
        super(dataSource);
    }

    public TagDAOImpl( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteDataSource dataSource,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.DAOMonitor daoMonitor) {
        super(dataSource, daoMonitor);
    }

    @Override
    public Class<Tag> getPojoClass() {
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
    public java.util.List<Tag> getTagList() {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Tag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Tag> getTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Tag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Tag> getTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Tag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public Tag getByName(String name) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(NAME.eq(name));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Tag> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Tag getTag(PlaceTag placeTag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(NAME.eq(placeTag.getTagName()));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        java.util.List<Tag> list = select(query, RESULT_SET_HANDLER).getObjectList();

        if (list.size() > 1) {
            throw new RuntimeException("More than one object returned");
        } else if (list.size() == 1) {
            return list.get(0);
        } else {
            return null;
        }
    }

    @Override
    public java.util.List<Tag> getTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Tag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Tag> getTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Tag>
                selectObjectListResult = select(query, RESULT_SET_HANDLER);
        return selectObjectListResult.getObjectList();
    }

    @Override
    public java.util.List<Tag> getTagList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.SelectQuery(TABLE_EXPRESSION);
        query.setWhere(where);
        query.orderBy(orderBy, asc);

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.SelectObjectListResult<Tag>
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
    public long insert(Tag tag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.InsertStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(NAME, tag.getName());

        query.setValues(values);

        long id = insert(query);


        return id;
    }

    @Override
    public void insert(java.util.Collection<Tag> tags) {
        for(Tag obj : tags) {
            insert(obj);
        }
    }

    @Override
    public void update(Tag tag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.UpdateStatement (TABLE_EXPRESSION);
        java.util.Map< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object> values =
                new java.util.HashMap< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column, Object>();

        values.put(NAME, tag.getName());

        query.setValues(values);

        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(TagDAO.NAME,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(tag.getName())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        update(query);
    }

    @Override
    public void update(java.util.Collection<Tag> tags) {
        for(Tag obj : tags) {
            update(obj);
        }
    }

    @Override
    public void delete(Tag tag) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.eq(TagDAO.NAME,
                 ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp.exp(tag.getName())));
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);

        delete(query);
    }

    @Override
    public void delete(String name) {
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement query =
                new  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.DeleteStatement (TABLE_EXPRESSION);
        java.util.List< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp> lExps =
                new java.util.LinkedList< ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp>();

        lExps.add(NAME.eq(name));

         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where =  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp.and(lExps);

        query.setWhere(where);
        delete(query);
    }

    @Override
    public void delete(java.util.Collection<Tag> tags) {
        for(Tag obj : tags) {
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
