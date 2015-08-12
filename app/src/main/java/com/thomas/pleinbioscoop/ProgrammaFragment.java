package com.thomas.pleinbioscoop;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ProgrammaFragment extends ListFragment {
    int mCurCheckPosition = 0;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Get the movies array from strings.xml
        Resources res = getResources();
        String[] movies = res.getStringArray(R.array.movies);

        // Populate list with our static array of titles.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                R.layout.programme_list_item, R.id.list_item, movies);
        setListAdapter(adapter);

        //new listener
        ListView l = getListView();
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent myIntent = new Intent(getActivity(), FilmActivity.class);
                myIntent.putExtra("index", position);
                //Toast.makeText(getActivity(), position+"", Toast.LENGTH_SHORT).show();
                getActivity().startActivity(myIntent);
            }
        });

        // Restore last state for checked position.
        if (savedInstanceState != null) {
            mCurCheckPosition = savedInstanceState.getInt("curChoice", 0);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_programma, container, false);

        return rootView;
    }

}