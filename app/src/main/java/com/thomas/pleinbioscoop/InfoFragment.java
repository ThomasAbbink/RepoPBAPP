package com.thomas.pleinbioscoop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InfoFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        return rootView;
    }

    static void myOnItemClick(View v) {
        ViewGroup group = (ViewGroup) v.getParent();
        View detail = group.getChildAt(1);

        if ( detail.getVisibility() == View.GONE)
            detail.setVisibility(View.VISIBLE);
        else
            detail.setVisibility(View.GONE);
    }

}