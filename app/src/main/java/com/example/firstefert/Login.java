package com.example.firstefert;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.firstefert.MainActivity;
import com.example.firstefert.MainActivity;

public class Login extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_one);

        findViewById(R.id.btnLogin).setOnClickListener(view -> {
            Intent intent = new Intent(Login.this,sign_up.class);
            startActivity(intent);
            finish();
        });

        findViewById(R.id.btnFragmentOne).setOnClickListener(view -> {
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        });
    }
}