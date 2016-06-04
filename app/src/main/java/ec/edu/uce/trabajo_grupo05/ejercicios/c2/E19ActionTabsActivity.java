package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;

public class E19ActionTabsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c2e19tabs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        E19SlidingTabLayout tabLayout = (E19SlidingTabLayout) findViewById(R.id.tabs);

        viewPager.setAdapter(new TabsPagerAdapter(this));

        /*
         * SlidingTabLayout is bound to ViewPager, both for tab titles
         * and scroll tracking behavior.
         */
        tabLayout.setViewPager(viewPager);
        tabLayout.setCustomTabColorizer(new E19SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                //Color to show underneath each tab position
                return Color.WHITE;
            }

            @Override
            public int getDividerColor(int position) {
                //Transparent to hide dividers
                return 0;
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    /*
     * Simple PagerAdapter to display page views with static images
     */
    private static class TabsPagerAdapter extends PagerAdapter {

        private Context mContext;

        public TabsPagerAdapter(Context context) {
            mContext = context;
        }

        /*
         * SlidingTabLayout requires this method to define the
         * text that each tab will display.
         */
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Primary";
                case 1:
                    return "Secondary";
                case 2:
                    return "Tertiary";
                case 3:
                    return "Quaternary";
                case 4:
                    return "Quinary";
                default:
                    return "";
            }
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView pageView = new ImageView(mContext);
            pageView.setScaleType(ImageView.ScaleType.CENTER);
            pageView.setImageResource(R.drawable.uce_logo);

            container.addView(pageView);

            return pageView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return (view == object);
        }
    }
}
