package com.example.moviefinderrz;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button backButton = findViewById(R.id.buttonBack);
        backButton.setOnClickListener(view -> finish());
    }
}
