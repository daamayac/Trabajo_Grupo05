package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import ec.edu.uce.trabajo_grupo05.R;

public class E11SupportFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView tv = new TextView(getActivity());
        tv.setText("Fragment");
        tv.setBackgroundColor(Color.RED);
        return tv;
    }
    
    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        switch (transit) {
        case FragmentTransaction.TRANSIT_FRAGMENT_FADE:
            if (enter) {
                return AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_in);
            } else {
                return AnimationUtils.loadAnimation(getActivity(), android.R.anim.fade_out);
            }
        case FragmentTransaction.TRANSIT_FRAGMENT_CLOSE:
            if (enter) {
                return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_close_enter);
            } else {
                return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_close_exit);
            }
        case FragmentTransaction.TRANSIT_FRAGMENT_OPEN:
        default:
            if (enter) {
                return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_open_enter);
            } else {
                return AnimationUtils.loadAnimation(getActivity(), R.anim.activity_open_exit);
            }
        }
    }
}
