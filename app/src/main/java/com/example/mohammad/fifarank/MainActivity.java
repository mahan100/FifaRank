package com.example.mohammad.fifarank;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends AppCompatActivity  {

    private TextView mTextMessage;
    private Toolbar mytoolbar;


    Fragment fragment;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ///////////////////
        mytoolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mytoolbar);
        /////////////////////////////
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        ////////////////////////////
        fragmentManager=getSupportFragmentManager();
        fragment=new LeagueFragment();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_layout,fragment)
                .commit();
        ////////////////////


    }

    protected void attachBaseContext(Context newbase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newbase));
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {

                case R.id.navigation_league:
                    fragment=new LeagueFragment();
                    fragmentManager.beginTransaction()
                            .replace(R.id.frame_layout,fragment)
                            .commit();
                    return true;

                case R.id.navigation_cup:
                    fragment=new CupFragment();
                    fragmentManager.beginTransaction()
                            .replace(R.id.frame_layout,fragment)
                            .commit();
                    return true;

                case R.id.navigation_statistics:
                    fragment=new StatisticsFragment();
                    fragmentManager.beginTransaction()
                            .replace(R.id.frame_layout,fragment)
                            .commit();
                    return true;

                case R.id.navigation_forcasting:
                    fragment=new ProjectionFragment();
                    fragmentManager.beginTransaction()
                            .replace(R.id.frame_layout,fragment)
                            .commit();
                    return true;
            }

            return false;


        }

    };



    }
