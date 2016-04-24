package com.darrienglasser.goatfish;

import android.content.Intent;
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
    /**
     * Button used to bring user to advanced search screen.
     */
    View mAdvancedSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        mSearchContainer = findViewById(R.id.parent_search_container);
        mSearchBar = (SearchView) findViewById(R.id.search_view);
        mSearchBar.setQueryHint(getString(R.string.search_field));
        mAdvancedSearchButton = findViewById(R.id.advanced_search_button);
        setTitle(getString(R.string.title_bar_name));
        mSearchContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSearchBar.onActionViewExpanded();
            }
        });

        mSearchBar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Intent intent = new Intent(SearchActivity.this, SimpleResultsActivity.class);
                intent.putExtra(getString(R.string.simple_query), query);
                startActivity(intent);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        mAdvancedSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, AdvancedSearchActivity.class);
                startActivity(intent);
            }
        });
    }
}
