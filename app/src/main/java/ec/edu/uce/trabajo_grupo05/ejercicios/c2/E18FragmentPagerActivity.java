package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import ec.edu.uce.trabajo_grupo05.R;

public class E18FragmentPagerActivity extends AppCompatActivity {

    private ArrayList<String> mListItems;
    private E18ListPagerAdapter mAdapter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2e18viewpager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Create the initial data set
        mListItems = new ArrayList<String>();
        mListItems.add("Mom");
        mListItems.add("Dad");
        mListItems.add("Sister");
        mListItems.add("Brother");
        mListItems.add("Cousin");
        mListItems.add("Niece");
        mListItems.add("Nephew");
        //Attach the data to the pager
        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);
        mAdapter = new E18ListPagerAdapter(getSupportFragmentManager(), mListItems);
        
        pager.setAdapter(mAdapter);
       
    }
    
    public void onAddClick(View v) {
        //Add a new unique item to the end of the list
        mListItems.add("Crazy Uncle " + System.currentTimeMillis());
        mAdapter.notifyDataSetChanged();
    }
    
    public void onRemoveClick(View v) {
        //Remove an item from the head of the list
        if (!mListItems.isEmpty()) {
            mListItems.remove(0);
        }
        mAdapter.notifyDataSetChanged();
    }
}
