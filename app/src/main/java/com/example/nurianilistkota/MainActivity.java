package com.example.nurianilistkota;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> cities;
    private CityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi data kota
        cities = new ArrayList<>();
        cities.add("Jakarta");
        cities.add("Surabaya");
        cities.add("Bandung");
        cities.add("Yogyakarta");
        cities.add("Medan");
        cities.add("Semarang");

        // Inisialisasi listview
        listView = findViewById(R.id.lv_cities);

        // Inisialisasi adapter
        adapter = new CityAdapter(this, cities);

        // Set adapter ke listview
        listView.setAdapter(adapter);
    }
}
