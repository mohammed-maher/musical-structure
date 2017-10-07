package com.re_coded.example.android.mybeats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView tracks = (CardView) findViewById(R.id.tracks_card_view);
        tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tracksActivity = new Intent(MainActivity.this, Tracks.class);
                startActivity(tracksActivity);

            }
        });


        CardView genres = (CardView) findViewById(R.id.genres_card_view);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tracksActivity = new Intent(MainActivity.this, Genres.class);
                startActivity(tracksActivity);

            }
        });

        CardView albums = (CardView) findViewById(R.id.albums_card_view);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tracksActivity = new Intent(MainActivity.this, Albums.class);
                startActivity(tracksActivity);

            }
        });

        CardView artists = (CardView) findViewById(R.id.artists_card_view);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tracksActivity = new Intent(MainActivity.this, Artists.class);
                startActivity(tracksActivity);

            }
        });

    }


}
