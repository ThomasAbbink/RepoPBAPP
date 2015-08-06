package com.thomas.pleinbioscoop;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) { //Todo: check whether index is within @string/count_tabs range

        switch (index) {
            case 0:
                // Top Rated fragment activity
                return new ProgrammaFragment();
            case 1:
                // Games fragment activity
                return new InfoFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2; //ToDo no magic numbers!, refer to tabs_count in @string
    }

}