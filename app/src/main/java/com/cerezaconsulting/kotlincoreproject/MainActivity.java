package com.cerezaconsulting.kotlincoreproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Bundle bundle = new Bundle();
            bundle.putString("text","text");
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = FragmentOne.newInstance(bundle);
                    setFragment();
                    return true;
                case R.id.navigation_dashboard:
                    fragment = FragmentTwo.newInstance();
                    setFragment();
                    return true;
                case R.id.navigation_notifications:
                    fragment = FragmentThree.newInstance();
                    setFragment();
                    return true;
                default:
                    return false;
            }
        }

    };

    private void setFragment(){
        getSupportFragmentManager().beginTransaction().replace(
                R.id.fragmentContainer, fragment)
                .commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        Bundle bundle = new Bundle();
        bundle.putString("text","initial");
        fragment = FragmentOne.newInstance(bundle);
        setFragment();
    }

}
