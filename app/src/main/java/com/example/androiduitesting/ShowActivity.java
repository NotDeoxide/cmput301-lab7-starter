package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "com.example.androiduitesting.CITY_NAME";

    TextView cityNameText;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        cityNameText = findViewById(R.id.text_city_name);
        backButton   = findViewById(R.id.button_back);

        // retrieve city name
        Intent intent = getIntent();
        String cityName = intent.getStringExtra(EXTRA_CITY_NAME);
        cityNameText.setText(cityName);

        // back button to mainactivity
        backButton.setOnClickListener(v -> finish());
    }
}
