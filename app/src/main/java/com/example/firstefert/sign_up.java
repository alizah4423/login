package com.example.firstefert;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        findViewById(R.id.btnregister).setOnClickListener(view -> {
            Intent intent = new Intent(sign_up.this, Login.class);
            startActivity(intent);
            finish();
        });
    }
}