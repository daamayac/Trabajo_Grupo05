package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import ec.edu.uce.trabajo_grupo05.R;

public class E08MyActivity extends AppCompatActivity {
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView list = new ListView(this);
        setContentView(list);
        
        CustomAdapter adapter = new CustomAdapter(this,
                R.layout.activity_c1e8,
                    R.id.line1,
                    new String[] {"Bill","Tom","Sally","Jenny"});
        list.setAdapter(adapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

    }

    private static class CustomAdapter extends ArrayAdapter<String> {
        
        public CustomAdapter(Context context, int layout, int resId, String[] items) {
            //Call through to ArrayAdapter implementation
            super(context, layout, resId, items);
        }
        
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            //Inflate a new row if one isn't recycled
            if(row == null) {
                row = LayoutInflater.from(getContext()).inflate(R.layout.activity_c1e8, parent, false);
            }

            String item = getItem(position);
            ImageView left = (ImageView)row.findViewById(R.id.leftimage);
            ImageView right = (ImageView)row.findViewById(R.id.rightimage);
            TextView text = (TextView)row.findViewById(R.id.line1);

            left.setImageResource(R.mipmap.ic_launcher);
            right.setImageResource(R.mipmap.ic_launcher);
            text.setText(item);

            return row;
        }
    }
}