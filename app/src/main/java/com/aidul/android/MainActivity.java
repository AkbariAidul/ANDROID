package com.aidul.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void uts1(View view) {
        Intent touts1 = new Intent(getApplicationContext(), uts_1.class);
        startActivity(touts1);
    }

    public void uts2(View view) {
        Intent touts2 = new Intent(getApplicationContext(), uts_2.class);
        startActivity(touts2);
    }

    public void uts3(View view) {
        Intent touts3 = new Intent(getApplicationContext(), uts_3.class);
        startActivity(touts3);
    }
}