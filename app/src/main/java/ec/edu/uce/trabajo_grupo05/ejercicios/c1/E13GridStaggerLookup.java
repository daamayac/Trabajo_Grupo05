package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.support.v7.widget.GridLayoutManager;

public class E13GridStaggerLookup extends GridLayoutManager.SpanSizeLookup {

    @Override
    public int getSpanSize(int position) {
        return (position % 3 == 0 ? 2 : 1);
    }
}
