package com.publicbicycle.skyware.citytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;


public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        City city = gson.fromJson(CityJson.cityJson, City.class);

        text = (TextView) findViewById(R.id.main_text);
    }




}
