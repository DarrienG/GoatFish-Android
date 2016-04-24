package com.darrienglasser.goatfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ResultsActivity extends AppCompatActivity {

    ListView mCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mCardView = (ListView) findViewById(R.id.card_view);
    }
}
