package com.darrienglasser.goatfish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class SimpleResultsActivity extends AppCompatActivity {

    ListView mCardView;
    View mNoResultsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        MockData data = new MockData();
        String name = getIntent().getStringExtra(getString(R.string.simple_query));
        if (name == null || name.equals("")) {
            displayNothing();
            return;
        }
        name = name.toUpperCase();
        setTitle(name);
        ArrayList<Vessel> filteredVessel = new ArrayList<>();
        ArrayList<Vessel> mockDataList = data.getMockVesselList();
        for (Vessel v: mockDataList) {
            if (v != null && v.getName() != null && v.getName().contains(name)) {
                filteredVessel.add(v);
            }
        }
        if (filteredVessel.size() == 0) {
            displayNothing();
            return;
        }
        mCardView = (ListView) findViewById(R.id.card_view);
        mCardView.setAdapter(
                new CardListAdapter(this, R.layout.results_row, filteredVessel));

    }

    public void displayNothing() {
        mNoResultsView = findViewById(R.id.no_results);
        mNoResultsView.setVisibility(View.VISIBLE);
        View v = findViewById(R.id.return_button);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
