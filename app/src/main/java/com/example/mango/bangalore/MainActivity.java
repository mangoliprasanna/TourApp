package com.example.mango.bangalore;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.RatingBar;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        CustomPagerAdapter customPagerAdapter = new CustomPagerAdapter(getSupportFragmentManager());
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        customPagerAdapter.add(new PlaceFragment(), getString(R.string.tab_1));
        customPagerAdapter.add(new RestaurantFragment(), getString(R.string.tab_2));
        customPagerAdapter.add(new ShoppingFragment(), getString(R.string.tab_3));
        customPagerAdapter.add(new NearByFragment(), getString(R.string.tab_4));


        viewPager.setAdapter(customPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    class CustomPagerAdapter extends FragmentStatePagerAdapter{

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentName = new ArrayList<>();

        public CustomPagerAdapter(FragmentManager fm)
        {
            super(fm);
        }
        public void add(Fragment fm, String name)
        {
            mFragmentList.add(fm);
            mFragmentName.add(name);
        }
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position)
        {
            return mFragmentName.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }
    }
}
