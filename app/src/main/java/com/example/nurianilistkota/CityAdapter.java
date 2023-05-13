package com.example.nurianilistkota;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> cities;

    public CityAdapter(Context context, ArrayList<String> cities) {
        this.context = context;
        this.cities = cities;
    }

    @Override
    public int getCount() {
        return cities.size();
    }

    @Override
    public Object getItem(int position) {
        return cities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.city_item, parent, false);
        }

        String city = cities.get(position);

        TextView tvCityName = convertView.findViewById(R.id.tv_city_name);
        tvCityName.setText(city);

        return convertView;
    }
}
