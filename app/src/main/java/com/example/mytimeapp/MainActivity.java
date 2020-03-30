package com.example.mytimeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mytimeapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DailyWeather hoy = new DailyWeather("Santiago", "05-05-2020", getDrawable(R.drawable.ic_wb_sunny_black_24dp), 24, "°C");
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.city(hoy);
        binding.setTimehoy);
    }
}
