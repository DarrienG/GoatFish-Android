package com.darrienglasser.goatfish;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

public class AdvancedSearchActivity extends AppCompatActivity {

    /**
     * Radio.
     */
    private EditText mRadioView;

    /**
     * Boat lettering.
     */
    private EditText mLetteringView;

    /**
     * Owner's ID.
     */
    private EditText mOwnerIdView;

    /**
     * Permit.
     */
    private EditText mPermitView;

    /**
     * Gear/equipment.
     */
    private EditText mGearView;

    /**
     * Location boat is registered.
     */
    private EditText mLocationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_search);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        setTitle(getString(R.string.advanced_search));

        mRadioView = (EditText) findViewById(R.id.radio_call_sign_view);
        mLetteringView = (EditText) findViewById(R.id.lettering_view);
        mOwnerIdView = (EditText) findViewById(R.id.owner_id_view);
        mPermitView = (EditText) findViewById(R.id.permit_view);
        mGearView = (EditText) findViewById(R.id.gear_view);
        mLocationView = (EditText) findViewById(R.id.area_view);

        View v = findViewById(R.id.forward_button);
        if (v != null)
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAndPushData();
            }
        });

    }

    /**
     * Helper method. Gets text from views, saves in a value, and then pushes that data to an
     * activity that handles the results.
     */
    private void getAndPushData() {
        SearchDataContainer container = new SearchDataContainer(
                mRadioView.getText().toString(),
                mLetteringView.getText().toString(),
                mOwnerIdView.getText().toString(),
                mPermitView.getText().toString(),
                mGearView.getText().toString(),
                mLocationView.getText().toString()
        );

        Intent intent = new Intent(AdvancedSearchActivity.this, ResultsActivity.class);
        intent.putExtra(getString(R.string.search_data), container);
        startActivity(intent);
    }
}
