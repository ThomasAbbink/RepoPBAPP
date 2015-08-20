package com.thomas.pleinbioscoop;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class FilmActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);

        Resources res = getResources();
        String date = res.getStringArray(R.array.fulldates)[index];
        String title = res.getStringArray(R.array.titles)[index];
        String info = res.getStringArray(R.array.info)[index];
        String plot = res.getStringArray(R.array.plot)[index];
        String muziek = res.getStringArray(R.array.muziek)[index];
        String trailer_url = res.getStringArray(R.array.trailer_url)[index];
        int thumbnail = getResources().getIdentifier("f"+index, "drawable", getPackageName());

        ((TextView)findViewById(R.id.moviedate)).setText(date);
        ((TextView)findViewById(R.id.movietitle)).setText(title);
        ((TextView)findViewById(R.id.movieinfo)).setText(info);
        ((TextView)findViewById(R.id.movieplot)).setText(plot);
        ((TextView)findViewById(R.id.muziek)).setText(muziek);
        ((TextView)findViewById(R.id.trailer_url)).setText(trailer_url); //hidden textview for url
        ((ImageView)findViewById(R.id.trailerbutton)).setImageResource(thumbnail);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onTrailerClick(View v) {
        // Get the correct youtube url.
        String url = (((TextView)findViewById(R.id.trailer_url)).getText()).toString();

        // Create intent with correct url and start it.
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

    public void onTicketsClick(View v){
        String url = "https://pleinbioscoop.stager.nl/web/tickets";

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
    }

}




