package com.darrienglasser.goatfish;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CardListAdapter extends ArrayAdapter<Vessel> {
    public CardListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CardListAdapter(Context context, int resource, List<Vessel> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.results_row, parent, false);
        Resources res = getContext().getResources();
        Vessel vessel = getItem(position);
        TextView vesselView = (TextView) v.findViewById(R.id.vessel_name);
        TextView yearView = (TextView) v.findViewById(R.id.year);
        TextView lengthView = (TextView) v.findViewById(R.id.length);
        TextView tonnageView = (TextView) v.findViewById(R.id.tonnage);
        vesselView.setText(String.format(res.getString(R.string.vessel_name), vessel.getName()));
        yearView.setText(String.format(res.getString(R.string.year), vessel.getYear()));
        lengthView.setText(
                String.format(
                        res.getString(R.string.length),
                        vessel.getLength(),
                        vessel.getLengthUnits()));
        tonnageView.setText(
                String.format(
                        res.getString(R.string.tonnage),
                        vessel.getTonnage(),
                        vessel.getTonnageType()));
        return v;
    }
}