package com.thomas.pleinbioscoop;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;


public class ProgrammeAdapter extends BaseAdapter {

    private Context mcontext;

    public ProgrammeAdapter(Context c){
        mcontext = c;
    }

    @Override
    public int getCount() {
        return 19;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }
}
