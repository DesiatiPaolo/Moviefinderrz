package com.example.moviefinderrz;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviefinderrz.UI.MFButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MFButton button = findViewById(R.id.button);
        button.setText(getResources().getString(R.string.login));
        getWindow().setStatusBarColor(getColor(R.color.black));
        getWindow().setNavigationBarColor(getColor(R.color.black));
    }
}