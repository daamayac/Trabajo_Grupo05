package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class E13InsetDecoration extends RecyclerView.ItemDecoration {

    private int mInsetMargin;

    public E13InsetDecoration(Context context) {
        super();
      //  mInsetMargin = context.getResources()
        //        .getDimensionPixelOffset(R.dimen.inset_margin);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.set(mInsetMargin, mInsetMargin, mInsetMargin, mInsetMargin);
    }
}
