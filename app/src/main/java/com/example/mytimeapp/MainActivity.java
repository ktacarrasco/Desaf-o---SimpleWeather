package com.example.mytimeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mytimeapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DailyWeather hoy = new DailyWeather("Santiago", "17-10-2019", getDrawable(R.drawable.ic_wb_sunny_black_24dp), 24, "°C");
        //DailyWeather Mañana = new DailyWeather("Santiago", "06-05-2020", getDrawable(R.drawable.ic_wb_cloudy_black_24dp), 11, "°C");
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        binding.setTime(hoy);
        btn = (Button)findViewById(R.id.tomorrow);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DailyWeather mañana = new DailyWeather("Santiago", "18-10-2019", getDrawable(R.drawable.ic_wb_cloudy_black_24dp), 11, "°C");

                binding.setTime(mañana) ;

            }
        });


    }


}
