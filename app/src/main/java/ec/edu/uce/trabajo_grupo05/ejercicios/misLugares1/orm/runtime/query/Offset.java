package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.runtime.query;

import java.util.List;

/**
 * Represents an OFFSET clause.
 */
public class Offset implements Expression {

    protected AExp offset;

    public Offset(AExp offset) {
        this.offset = offset;
    }

    @Override
    public void build(StringBuilder sb, List<Value> objs) {
        offset.build(sb, objs);
    }
}
