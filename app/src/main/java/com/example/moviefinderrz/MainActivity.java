package com.example.moviefinderrz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.moviefinderrz.UI.MFButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MFButton button = findViewById(R.id.button);
        TextView link = findViewById(R.id.hyperlink);

        button.setText(getResources().getString(R.string.login));

        button.setOnClickListener(view -> startActivity(new Intent(this, Login.class)));
        link.setOnClickListener(view -> startActivity(new Intent(this, Signup.class)));
    }
}