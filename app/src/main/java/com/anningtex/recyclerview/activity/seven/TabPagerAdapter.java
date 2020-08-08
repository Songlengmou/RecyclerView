package com.anningtex.recyclerview.activity.seven;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author Administrator
 * @ClassName: TabPagerAdapter
 */
public class TabPagerAdapter extends FragmentPagerAdapter {
    private List<String> title;
    private List<Fragment> views;

    public TabPagerAdapter(FragmentManager fm, List<String> title, List<Fragment> views) {
        super(fm);
        this.title = title;
        this.views = views;
    }

    @Override
    public Fragment getItem(int position) {
        return views.get(position);
    }

    @Override
    public int getCount() {
        return views.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
