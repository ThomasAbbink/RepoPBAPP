package com.thomas.pleinbioscoop;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ProgrammeAdapter extends BaseAdapter {

    private Context mcontext;
    private int layoutResourceId;
    private String[] dates;
    private String[] titles;

    public ProgrammeAdapter(Context c, int LayoutResourceId, String[] dates, String[] titles){
        this.mcontext = c;
        this.layoutResourceId = LayoutResourceId;
        this.dates = dates;
        this.titles = titles;
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
        View row = convertView;

        LayoutInflater inflater = ((Activity)mcontext).getLayoutInflater();
        row = inflater.inflate(layoutResourceId, parent, false);

        TextView date = (TextView) row.findViewById(R.id.date);
        TextView title = (TextView) row.findViewById(R.id.title);
        ImageView pijl = (ImageView) row.findViewById(R.id.pijltje);

        date.setText(dates[position]);
        title.setText(titles[position]);

        //Fix layout problems here:


        return row;
    }
}
