package com.darrienglasser.goatfish;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

public class CardListAdapter extends ArrayAdapter<ResultsMicroGroup> {
    public CardListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CardListAdapter(Context context, int resource, List<ResultsMicroGroup> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.results_row, parent, false);
        Resources res = getContext().getResources();
        ResultsMicroGroup group = getItem(position);
        TextView vesselView = (TextView) v.findViewById(R.id.vessel_name);
        TextView yearView = (TextView) v.findViewById(R.id.year);
        TextView countryView = (TextView) v.findViewById(R.id.country);
        TextView imoView = (TextView) v.findViewById(R.id.imo);
        TextView uviView = (TextView) v.findViewById(R.id.uvi);
        TextView lengthView = (TextView) v.findViewById(R.id.length);
        vesselView.setText(String.format(res.getString(R.string.vessel_name), group.getName()));
        yearView.setText(String.format(res.getString(R.string.year), group.getYear()));
        countryView.setText(String.format(res.getString(R.string.country), group.getCountry()));
        imoView.setText(String.format(res.getString(R.string.imo), group.getImo()));
        uviView.setText(String.format(res.getString(R.string.uvi), group.getUvi()));
        lengthView.setText(
                String.format(
                        res.getString(R.string.length),
                        group.getLength(),
                        group.getUnits()));

        return v;
    }
}