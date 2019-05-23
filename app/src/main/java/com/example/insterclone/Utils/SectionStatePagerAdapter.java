package com.example.insterclone.Utils;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SectionStatePagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final HashMap<Fragment, Integer> mFragments = new HashMap<>();
    private final HashMap<String, Integer> mFragmentNumbers = new HashMap<>();
    private final HashMap<Integer, String> mFragmentNames = new HashMap<>();

    public SectionStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int postition) {
        return mFragmentList.get(postition);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }


    public void addFragment(Fragment fragment , String fragementName){
        mFragmentList.add(fragment);
        mFragments.put(fragment, mFragmentList.size()-1);
        mFragmentNumbers.put(fragementName, mFragmentList.size()-1);
        mFragmentNames.put(mFragmentList.size()-1 , fragementName);
    }

    /**
     * returns the fragment number with name @param
     * @param fragmentName
     * @return
     */
    private Integer getFragmentNumber(String fragmentName){
        if (mFragmentNumbers.containsKey(fragmentName)){
            return mFragmentNumbers.get(fragmentName);
        } else {
            return null;
        }
    }

    /**
     * returns the fragment number with name @param
     * @param fragment
     * @return
     */
    private Integer getFragmentNumber(Fragment fragment){
        if (mFragmentNumbers.containsKey(fragment)){
            return mFragmentNumbers.get(fragment);
        } else {
            return null;
        }
    }

    /**
     * returns the fragment number with name @param
     * @param fragmentNumber
     * @return
     */
    private String getFragmentName(Integer fragmentNumber){
        if (mFragmentNames.containsKey(fragmentNumber)){
            return mFragmentNames.get(fragmentNumber);
        } else {
            return null;
        }
    }
}
