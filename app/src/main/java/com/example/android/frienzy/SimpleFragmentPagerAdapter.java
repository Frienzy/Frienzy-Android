package com.example.android.frienzy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rohith on 7/6/17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter{

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MenuFragment();
        } else if (position == 1) {
            return new ContactsFragment();
        } else {
            return new SettingsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
