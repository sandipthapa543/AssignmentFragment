package com.fragments.assignmentfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import adapter.ViewPageAdapter;
import fragment.Login;
import fragment.Signup;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);

       //tabLayout.setSelectedTabIndicatorColor(Color.parseColor("FFFFFF"));
        ViewPageAdapter viewPagerAdapter=new ViewPageAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new Login(),"login");
        viewPagerAdapter.addFragment(new Signup(),"sign up");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
