package com.darrienglasser.goatfish;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ExpandedView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expanded_view);
        Vessel v = (Vessel) getIntent().getSerializableExtra(getString(R.string.expanded_data));
        TextView vessel = (TextView) findViewById(R.id.vessel_name);
        TextView year = (TextView) findViewById(R.id.year);
        TextView length = (TextView) findViewById(R.id.length);
        TextView flag = (TextView) findViewById(R.id.flag);
        TextView imo = (TextView) findViewById(R.id.imo_view);
        TextView uvi = (TextView) findViewById(R.id.uvi);
        TextView tonnage = (TextView) findViewById(R.id.tonnage);
        TextView owner = (TextView) findViewById(R.id.owner);
        ImageView view = (ImageView) findViewById(R.id.flagImg);
        view.setVisibility(View.GONE);

        String nameStr = v.getName();
        String yearStr = v.getYear();
        String lenStr = v.getLength();
        String lenUnits = v.getLengthUnits();
        String imoStr = v.getImo();
        String uviStr = v.getUvi();
        String tonnageStr = v.getTonnage();
        String tonnageTypeStr = v.getTonnageType();
        String ownerStr = v.getOwner();
        String flagString = v.getFlag();

        if (nameStr == null) {
            nameStr = "No name";
        }
        if (yearStr == null) {
            yearStr = "Unknown";
        }
        if (lenStr == null) {
            lenStr = "Unknown";
        }
        if (flagString == null) {
            flagString = "Unknown";
        }
        if (lenUnits == null) {
            lenUnits = "";
        }
        if (imoStr == null) {
            imoStr = "Unknown";
        }
        if (uviStr == null) {
            uviStr = "Unknown";
        }
        if (tonnageStr == null) {
            tonnageStr = "Unknown";
        }
        if (tonnageTypeStr == null) {
            tonnageTypeStr = "";
        }
        if (ownerStr == null) {
            ownerStr = "Unknown";
        }

        setTitle(nameStr);

        vessel.setText(String.format(getString(R.string.vessel_name), nameStr));
        year.setText(String.format(getString(R.string.year), yearStr));
        length.setText(
                String.format(
                        getString(R.string.length),
                        lenStr,
                        lenUnits));
        flag.setText(String.format(getString(R.string.country), flagString));
        imo.setText(String.format(getString(R.string.imo), imoStr));
        uvi.setText(String.format(getString(R.string.uvi), uviStr));
        tonnage.setText(String.format(getString(R.string.tonnage), tonnageStr, tonnageTypeStr));
        owner.setText(String.format(getString(R.string.owner    ), ownerStr));

        if (flagString.contains("STATES")) {
            view.setImageResource(R.drawable.america_flag);
            view.setVisibility(View.VISIBLE);
        }


    }
}
