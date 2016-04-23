package com.darrienglasser.goatfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;


public class SearchActivity extends AppCompatActivity {

    /**
     * Container holding searchView. Allows us to add shadow to searchView and larger click target.
     */
    View mSearchContainer;
    /**
     * Main search bar.
     */
    SearchView mSearchBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        mSearchContainer = findViewById(R.id.parent_search_container);
        mSearchBar = (SearchView) findViewById(R.id.search_view);
        mSearchBar.setQueryHint(getString(R.string.search_field));

        mSearchContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSearchBar.onActionViewExpanded();
            }
        });
    }


}
