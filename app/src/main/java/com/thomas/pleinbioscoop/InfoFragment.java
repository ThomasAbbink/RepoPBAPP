package com.thomas.pleinbioscoop;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class InfoFragment extends ListFragment {

    String[] titles;
    String[] desc;
    ArrayAdapter<String> adapter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //String[] temp = {"herp", "derp", "derp2"};

        Resources res = getResources();
        titles = res.getStringArray(R.array.text_info);
        desc = res.getStringArray(R.array.text_desc);

        adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.info_list, R.id.textView1, titles);

        setListAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_programma, container, false);

        return rootView;
    }

    @Override
    public void onListItemClick (ListView l, View v, int position, long id){
        TextView detail = (TextView) getActivity().findViewById(R.id.textView2);

        detail.setText(desc[position]);

        if ( detail.getVisibility() == View.GONE)
            detail.setVisibility(View.VISIBLE);
        else
            detail.setVisibility(View.GONE);

        //adapter.notifyDataSetChanged()
    }


}