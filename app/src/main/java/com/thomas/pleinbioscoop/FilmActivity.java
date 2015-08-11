package com.thomas.pleinbioscoop;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;


public class FilmActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);

        Resources res = getResources();
        String title = res.getStringArray(R.array.titles)[index];
        String info = res.getStringArray(R.array.info)[index];
        String plot = res.getStringArray(R.array.plot)[index];
        String trailer = res.getStringArray(R.array.trailer)[index];


        ((TextView) findViewById(R.id.movietitle)).setText(title);
        ((TextView)findViewById(R.id.movieinfo)).setText(info);
        ((TextView)findViewById(R.id.movieplot)).setText(plot);
        ((TextView)findViewById(R.id.trailer_url)).setText(trailer);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_film, menu);
        return true;
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
}
