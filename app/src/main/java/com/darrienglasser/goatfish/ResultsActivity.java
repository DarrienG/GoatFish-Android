package com.darrienglasser.goatfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ResultsActivity extends AppCompatActivity {

    ListView mCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<ResultsMicroGroup> resultsMicroList = new ArrayList<>();

        ResultsMicroGroup rmg = new ResultsMicroGroup("Darrien", "1995", "IMO124432", "UVIfsf", "293.2", "FT", "USA");
        resultsMicroList.add(rmg);
        setContentView(R.layout.activity_results);
        mCardView = (ListView) findViewById(R.id.card_view);
        mCardView.setAdapter(
                new CardListAdapter(this, R.layout.results_row, resultsMicroList));

    }
}
