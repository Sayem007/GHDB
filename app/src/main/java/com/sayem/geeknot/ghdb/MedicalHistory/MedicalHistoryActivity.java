package com.sayem.geeknot.ghdb.MedicalHistory;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sayem.geeknot.ghdb.R;

public class MedicalHistoryActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    Toolbar toolbar;
    ViewPager vp;
    TabLayout tabLayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medical_history);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("  Medical History");
        toolbar.setTitleTextColor(0xFFFFFFFF);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_ghdb);

        vp = (ViewPager) findViewById(R.id.mViewpager_ID3);
        this.addPages();
        tabLayout = (TabLayout) findViewById(R.id.mTab_ID3);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages() {
        MyPagerAdapter3 pagerAdapter = new MyPagerAdapter3(this.getSupportFragmentManager());
        pagerAdapter.addFragment3(new Fragment_medical1());
        pagerAdapter.addFragment3(new Fragment_medical2());
        pagerAdapter.addFragment3(new Fragment_medical3());
        pagerAdapter.addFragment3(new Fragment_medical4());


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