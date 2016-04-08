package com.example.jyodroid.jokeshower;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeShowerActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_shower);
        Intent jokeIntent = getIntent();
        String joke = jokeIntent.getStringExtra(JOKE_EXTRA);

        TextView jokeTV = (TextView) findViewById(R.id.joke_display);
        jokeTV.setText(joke);
    }
}
