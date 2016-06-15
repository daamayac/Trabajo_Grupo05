package ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.trabajo_grupo05.R;
import ec.edu.uce.trabajo_grupo05.ejercicios.misLugares1.orm.gen.Place;

/**
 * Adapter for list view in Main Activity.
 */
public class PlaceStringAdapter extends BaseAdapter {

    protected Context ctx;
    protected List<Place> places = new ArrayList<>();

    public PlaceStringAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return this.places.size();
    }

    @Override
    public Object getItem(int position) {
        return this.places.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(this.ctx);
            v = vi.inflate(R.layout.place_list_item, null);
        }

        Place p = (Place) getItem(position);

        if (p != null) {
            TextView txt = (TextView) v.findViewById(R.id.list_item_name);
            RatingBar rat = (RatingBar) v.findViewById(R.id.list_item_rating);

            if (txt != null) {
                txt.setText(p.getName());
            }

            if (rat != null) {
                rat.setRating(p.getRating());
            }
        }

        return v;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
