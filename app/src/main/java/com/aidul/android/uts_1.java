package com.aidul.android;

import android.os.Bundle;
import android.view.View; // Wajib import ini
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class uts_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts1);
        // Di sini kosong saja, tidak perlu panggil Button
    }

    // Nama method ini harus SAMA PERSIS dengan android:onClick di XML
    public void hitungBalok(View view) {

        // 1. Kenalkan komponen (langsung di dalam method ini)
        EditText edtP = findViewById(R.id.panjang);
        EditText edtL = findViewById(R.id.lebar);
        EditText edtT = findViewById(R.id.tinggi);
        TextView tvLuas = findViewById(R.id.luas);
        TextView tvVolume = findViewById(R.id.volume);

        // 2. Ambil angka
        // (Pakai try-catch biar aplikasi gak crash kalau input kosong)
        try {
            double p = Double.parseDouble(edtP.getText().toString());
            double l = Double.parseDouble(edtL.getText().toString());
            double t = Double.parseDouble(edtT.getText().toString());

            // 3. Rumus
            double luas = 2 * ((p * l) + (p * t) + (l * t));
            double volume = p * l * t;

            // 4. Tampilkan
            tvLuas.setText("Luas: " + luas);
            tvVolume.setText("Volume: " + volume);

        } catch (NumberFormatException e) {
            // Kalau kosong, tidak ngapa-ngapain atau kasih pesan error
        }
    }
}