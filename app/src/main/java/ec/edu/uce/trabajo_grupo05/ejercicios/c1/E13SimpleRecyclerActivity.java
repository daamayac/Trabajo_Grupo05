package ec.edu.uce.trabajo_grupo05.ejercicios.c1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;

public class E13SimpleRecyclerActivity extends AppCompatActivity implements
        E13SimpleItemAdapter.OnItemClickListener {

    private RecyclerView mRecyclerView;
    private E13SimpleItemAdapter mAdapter;

    /* Layout Managers */
    private LinearLayoutManager mHorizontalManager;
    private LinearLayoutManager mVerticalManager;
    private GridLayoutManager mVerticalGridManager;
    private GridLayoutManager mHorizontalGridManager;

    /* Decorations */
    private E13ConnectorDecoration mConnectors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRecyclerView = new RecyclerView(this);

        mHorizontalManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mVerticalManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mVerticalGridManager = new GridLayoutManager(this,
                2, /* Number of grid columns */
                LinearLayoutManager.VERTICAL, /* Orient grid vertically */
                false);
        mHorizontalGridManager = new GridLayoutManager(this,
                3, /* Number of grid rows */
                LinearLayoutManager.HORIZONTAL, /* Orient grid horizontally */
                false);

        //Connector line decorations for vertical grid
        mConnectors = new E13ConnectorDecoration(this);

        //Stagger the vertical grid
        mVerticalGridManager.setSpanSizeLookup(new E13GridStaggerLookup());

        mAdapter = new E13SimpleItemAdapter(this);
        mAdapter.setOnItemClickListener(this);
        mRecyclerView.setAdapter(mAdapter);

        //Apply margins decoration to all collections
        mRecyclerView.addItemDecoration(new E13InsetDecoration(this));

        //Default to vertical layout
        selectLayoutManager(R.id.action_vertical);
        setContentView(mRecyclerView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.c1e13layout_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return selectLayoutManager(item.getItemId());
    }

    private boolean selectLayoutManager(int id) {
        switch (id) {
            case R.id.action_vertical:
                mRecyclerView.setLayoutManager(mVerticalManager);
                mRecyclerView.removeItemDecoration(mConnectors);
                return true;
            case R.id.action_horizontal:
                mRecyclerView.setLayoutManager(mHorizontalManager);
                mRecyclerView.removeItemDecoration(mConnectors);
                return true;
            case R.id.action_grid_vertical:
                mRecyclerView.setLayoutManager(mVerticalGridManager);
                mRecyclerView.addItemDecoration(mConnectors);
                return true;
            case R.id.action_grid_horizontal:
                mRecyclerView.setLayoutManager(mHorizontalGridManager);
                mRecyclerView.removeItemDecoration(mConnectors);
                return true;
            case R.id.action_add_item:
                //Insert a new item
                mAdapter.insertItemAtIndex("Android Recipes", 1);
                return true;
            case R.id.action_remove_item:
                //Remove the first item
                mAdapter.removeItemAtIndex(1);
                return true;
            default:
                return false;
        }
    }

    /** OnItemClickListener Methods */

    @Override
    public void onItemClick(E13SimpleItemAdapter.ItemHolder item, int position) {
        Toast.makeText(this, item.getSummary(), Toast.LENGTH_SHORT).show();
    }
}
