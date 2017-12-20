package com.sayem.geeknot.ghdb.MentalHealthIntake;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sayem.geeknot.ghdb.R;

public class MentalHealthIntake2Activity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    Toolbar toolbar;
    ViewPager vp;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_health_intake2);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("  Mental Health Intake Form");
        toolbar.setTitleTextColor(0xFFFFFFFF);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_ghdb);



        vp = (ViewPager) findViewById(R.id.mViewpager_ID1);
        this.addPages();
        tabLayout = (TabLayout) findViewById(R.id.mTab_ID1);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages() {
        MyPagerAdapter1 pagerAdapter = new MyPagerAdapter1(this.getSupportFragmentManager());
        pagerAdapter.addFragment1(new Fragment_mental1());
        pagerAdapter.addFragment1(new Fragment_mental2());
        pagerAdapter.addFragment1(new Fragment_mental3());
        pagerAdapter.addFragment1(new Fragment_mental4());
        pagerAdapter.addFragment1(new Fragment_mental5());
        pagerAdapter.addFragment1(new Fragment_mental6());
        pagerAdapter.addFragment1(new Fragment_mental7());
        pagerAdapter.addFragment1(new Fragment_mental8());
        pagerAdapter.addFragment1(new Fragment_mental9());

        vp.setAdapter(pagerAdapter);
    }

    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }



    @Override
    public void onTabUnselected(TabLayout.Tab tab) {
    }
    @Override
    public void onTabReselected(TabLayout.Tab tab) {
    }

}