package com.anningtex.recyclerview.activity.seven;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.anningtex.recyclerview.R;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Administrator
 */
public class ContainerReportMangerActivity extends AppCompatActivity {
    @BindView(R.id.tl_myfile)
    TabLayout mTabLayout;
    @BindView(R.id.vp_myfile)
    ViewPager mViewPager;

    private List<String> mTitleList = new ArrayList<>();
    private List<Fragment> fragments = new ArrayList<>();
    private String countryName, loadDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container_report_manger);
        ButterKnife.bind(this);
        setTitle("Seven");

        countryName = getIntent().getStringExtra("countryName");
        loadDate = getIntent().getStringExtra("loadDate");

        mTitleList.add("装箱单");
        mTitleList.add("细码单");
        fragments.add(new ContainerReport01Fragment());
        fragments.add(new ContainerReport02Fragment(countryName, loadDate));

        TabPagerAdapter mAdapter = new TabPagerAdapter(getSupportFragmentManager(), mTitleList, fragments);
        mViewPager.setAdapter(mAdapter);

        mViewPager.setCurrentItem(0);
        mViewPager.setOffscreenPageLimit(2);

        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabsFromPagerAdapter(mAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition(), false);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}