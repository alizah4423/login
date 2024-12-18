package com.example.firstefert;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.Fragment.SavedState;
import androidx.fragment.app.Fragment.SavedState;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnFragmentOne).setOnClickListener(view -> {
            loadFragment(new fragment_one());
        });

        findViewById(R.id.btnFragmentTwo).setOnClickListener(view -> {
            loadFragment(new fragment_TWO());
        });

        // Load default fragment
        loadFragment(new fragment_one());
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .commit();
    }
}