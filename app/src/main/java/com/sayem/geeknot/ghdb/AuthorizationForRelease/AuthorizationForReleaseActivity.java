package com.sayem.geeknot.ghdb.AuthorizationForRelease;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.sayem.geeknot.ghdb.R;

public class AuthorizationForReleaseActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {

    Toolbar toolbar;
    ViewPager vp;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization_for_release);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("  Authorization for Release Form");
        toolbar.setTitleTextColor(0xFFFFFFFF);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_ghdb);

        vp = (ViewPager) findViewById(R.id.mViewpager_ID2);
        this.addPages();
        tabLayout = (TabLayout) findViewById(R.id.mTab_ID2);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(this);
    }

    private void addPages() {
        MyPagerAdapter2 pagerAdapter = new MyPagerAdapter2(this.getSupportFragmentManager());
        pagerAdapter.addFragment2(new Fragment_release1());
        pagerAdapter.addFragment2(new Fragment_release2());
        pagerAdapter.addFragment2(new Fragment_release3());
        pagerAdapter.addFragment2(new Fragment_release4());


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