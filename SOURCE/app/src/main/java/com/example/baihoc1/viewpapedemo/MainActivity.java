package com.example.baihoc1.viewpapedemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ViewPager vpServices;
    ArrayList<Fragment> data = new ArrayList<>();
    TabLayout tabtool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        prepareViewPager();
    }

    private void prepareViewPager() {
        ViewPagerServiceAdapter viewPagerServiceAdapter =
                new ViewPagerServiceAdapter(getSupportFragmentManager(),
                        this,data);
        vpServices.setAdapter(viewPagerServiceAdapter);
        tabtool.setupWithViewPager(vpServices);
    }

    private void init() {
        vpServices = findViewById(R.id.vp_services);
        tabtool = findViewById(R.id.tb_tool);
        OnServicesFragment onServicesFragment = new OnServicesFragment();
        FollowFragment followFragment = new FollowFragment();
        WarningFragment warningFragment = new WarningFragment();
        data.add(onServicesFragment);
        data.add(followFragment);
        data.add(warningFragment);

    }
}
