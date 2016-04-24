package com.darrienglasser.goatfish;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CardListAdapter extends ArrayAdapter<ResultsMicroGroup> {
    public CardListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CardListAdapter(Context context, int resource, List<ResultsMicroGroup> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Resources res = Resources.getSystem();
        ResultsMicroGroup group = getItem(position);
        TextView vesselView = (TextView) convertView.findViewById(R.id.vessel_name);
        TextView yearView = (TextView) convertView.findViewById(R.id.year);
        TextView countryView = (TextView) convertView.findViewById(R.id.country);
        TextView imoView = (TextView) convertView.findViewById(R.id.imo);
        TextView uviView = (TextView) convertView.findViewById(R.id.uvi);
        TextView lengthView = (TextView) convertView.findViewById(R.id.length);
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

        return convertView;
    }
}