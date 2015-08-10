package com.thomas.pleinbioscoop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ProgrammaFragment extends ListFragment {
    int mCurCheckPosition = 0;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] movies = {"wo 12 aug – Whiplash",
        "do 13 aug – Frank",
        "vr 14 aug – The Imitation Game",
        "za 15 aug – Chef",
        "zo 16 aug–Tussen 10 en 12",
        "ma 17 aug–Pride",
        "di 18 aug–Sergio Herman:Fucking Perfect",
        "wo 19 aug–White God",
        "do 20 aug– Indiana Jones and the Temple of Doom",
        "vr 21 aug – Guardians of the Galaxy",
        "za 22 aug – Birdman",
        "zo 23 aug – Meraviglie",
        "ma 24 aug – Still Alice",
        "di 25 aug – Turist",
        "wo 26 aug – Foxcatcher",
        "do 27 aug – Taxi Driver",
        "vr 28 aug – Wild",
        "za 29 aug – Gone Girl",
        "zo 30 aug – Love is Strange"};

        // Populate list with our static array of titles.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, movies);
        setListAdapter(adapter);

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


    @Override
    public void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);


    }
}