package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.gen;

public interface PlaceDAO extends
         ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.dao.DAO<Place> {

    /**
     * Table expression class representing table place
     */
    class PlaceTableExpression extends  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.TableExpression {
        /**
         * Default constructor.
         */
        PlaceTableExpression() {
            super("place");
            addColumn("id",  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteType.INTEGER, true);
            addColumn("name",  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteType.TEXT, true);
            addColumn("address_id",  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteType.INTEGER, true);
            addColumn("rating",  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteType.INTEGER, true);
            addColumn("added",  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteType.INTEGER, true);
            addColumn("comment",  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteType.TEXT, true);
            addColumn("image",  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.SQLiteType.NONE);
        }
    }

    /**
     * Result set handler class for table place
     */
    class PlaceResultSetHandler implements
             ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.util.ResultSetHandler<Place> {
        @Override
        public java.util.List<Place>
                getObjects(android.database.Cursor cursor) {
            java.util.List<Place> ret = new java.util.LinkedList<Place>();
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                Place obj = new Place();
                if (!cursor.isNull(0)) {
                    obj.setId(cursor.getInt(0));
                }
                if (!cursor.isNull(1)) {
                    obj.setName(cursor.getString(1));
                }
                if (!cursor.isNull(2)) {
                    obj.setAddressId(cursor.getInt(2));
                }
                if (!cursor.isNull(3)) {
                    obj.setRating(cursor.getInt(3));
                }
                if (!cursor.isNull(4)) {
                    obj.setAdded(new java.sql.Timestamp(cursor.getLong(4)));
                }
                if (!cursor.isNull(5)) {
                    obj.setComment(cursor.getString(5));
                }
                ret.add(obj);
                cursor.moveToNext();
            }
            return ret;
        }
    }

    /**
     * Corresponding POJO class.
     */
    Class<Place> POJO_CLASS = Place.class;
    /**
     * Table expression for the table.
     */
    PlaceTableExpression TABLE_EXPRESSION = new PlaceTableExpression();
    /**
     * Result set handler for the table.
     */
    PlaceResultSetHandler RESULT_SET_HANDLER = new PlaceResultSetHandler();
    /**
     * Column object representing column id
     */
     ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column ID = TABLE_EXPRESSION.getColumn("id");
    /**
     * Column object representing column name
     */
     ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column NAME = TABLE_EXPRESSION.getColumn("name");
    /**
     * Column object representing column address_id
     */
     ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column ADDRESS_ID = TABLE_EXPRESSION.getColumn("address_id");
    /**
     * Column object representing column rating
     */
     ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column RATING = TABLE_EXPRESSION.getColumn("rating");
    /**
     * Column object representing column added
     */
     ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column ADDED = TABLE_EXPRESSION.getColumn("added");
    /**
     * Column object representing column comment
     */
     ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column COMMENT = TABLE_EXPRESSION.getColumn("comment");
    /**
     * Column object representing column image
     */
     ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.Column IMAGE = TABLE_EXPRESSION.getColumn("image");

    /**
     * Returns value of image column
     * @param place POJO object representing row in table
     * @return value of image column
     */
    byte[] getImage(Place place);

    /**
     * Sets value of image column
     * @param place POJO object representing row in table
     * @param blob byte array to be put into column
     */
    void setImage(Place place, byte[] blob);
    /**
     * Returns all rows from table place
     * @return all rows from table funkcja.
     */
    java.util.List<Place> getPlaceList();

    /**
     * Returns all rows from table place
     * @param orderBy column to sort by
     * @return all rows from table funkcja.
     */
    java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table place
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table funkcja.
     */
    java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc);

    /**
     * Returns all rows from table place matching given where clause
     * @param where where clause
     * @return all rows from table place matching given where clause
     */
    java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where);

    /**
     * Returns all rows from table place matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @return all rows from table place matching given where clause
     */
    java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
                                        ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy);

    /**
     * Returns all rows from table place matching given where clause
     * @param where where clause
     * @param orderBy column to sort by
     * @param asc true to sort in ascending order, false otherwise
     * @return all rows from table place matching given where clause
     */
    java.util.List<Place> getPlaceList( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where,
                                        ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.AExp orderBy,  ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.OrderByDirection asc);

    /**
     * Returns row from table place based on value of primary key
     * @return row from table place
     */
    Place getById(Integer id);

    /**
     * Returns row from table place referencing given row from table address
     * @param address object representing row from referenced by row from table place
     * @return row from table place referencing given row from table address
     */
    Place getPlace(Address address);

    /**
     * Returns row from table place referenced by given row from table place_tag
     * @param placeTag object representing row referencing row from table place_tag
     * @return row from table place referenced by given row from table place_tag
     */
    Place getPlace(PlaceTag placeTag);

    /**
     * Returns number of all rows in table.
     * @return number of all rows in table
     */
    Long getCount();

    /**
     * Returns number of rows according to given WHERE query.
     * @param where where query
     * @return number of rows
     */
    Long getCount( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where);

    /**
     * Inserts row into table place
     * @param place place to be inserted.
     * @return id number of new row
     */
    long insert(Place place);

    /**
     * Inserts collection of rows into table place
     * @param places rows to be inserted
     */
    void insert(java.util.Collection<Place> places);

    /**
     * Updates row in table place
     * @param place place to be updated.
     */
    void update(Place place);

    /**
     * Updates collection of rows in table place
     * @param places rows to be update
     */
    void update(java.util.Collection<Place> places);

    /**
     * Deletes row from table place
     * @param place place to be deleted.
     */
    void delete(Place place);

    /**
     * Deletes row from table place based on primary key
     */
    void delete(Integer id);

    /**
     * Deletes collection of rows from table place
     * @param places rows to be deleted
     */
    void delete(java.util.Collection<Place> places);

    /**
     * Deletes all rows from table place matching given where clause
     * @param where where clause
     */
    void delete( ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query.LExp where);
}
