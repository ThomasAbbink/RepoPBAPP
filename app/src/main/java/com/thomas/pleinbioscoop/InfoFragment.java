package com.thomas.pleinbioscoop;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InfoFragment extends ListFragment {

    ListView list;
    String[] titles;
    String[] desc;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Resources res = getResources();
        list = (ListView) getActivity().findViewById(R.id.listview1);
        titles = res.getStringArray(R.array.text_info);
        desc = res.getStringArray(R.array.text_desc);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.info_list, R.id.listview1, titles);

        list.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_info, container, false);
        return rootView;
    }

}