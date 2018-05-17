package com.spotify.sdk.demo;

import android.os.Bundle;
import android.app.Activity;

import com.spotify.sdk.embedded.demo.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
