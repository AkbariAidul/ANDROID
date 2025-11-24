package com.aidul.android; // <-- Sesuaikan dengan nama packagemu sendiri

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast; // Untuk pesan error jika kosong

import androidx.appcompat.app.AppCompatActivity;

public class uts_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts1);

        // 1. Kenalkan komponen dari XML ke Java
        EditText panjang = findViewById(R.id.panjang);
        EditText lebar = findViewById(R.id.lebar);
        EditText tinggi = findViewById(R.id.tinggi);
        Button hitung = findViewById(R.id.hitung);
        TextView luas = findViewById(R.id.luas);
        TextView volume = findViewById(R.id.volume);

        // 2. Pasang aksi ketika tombol diklik
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil data dari kotak input
                String isiPanjang = panjang.getText().toString();
                String isiLebar = lebar.getText().toString();
                String isiTinggi = tinggi.getText().toString();

                // Cek apakah ada yang kosong (Validasi)
                if (isiPanjang.isEmpty() || isiLebar.isEmpty() || isiTinggi.isEmpty()) {
                    Toast.makeText(uts_1.this, "Mohon isi semua data!", Toast.LENGTH_SHORT).show();
                    return; // Berhenti di sini, jangan lanjut hitung
                }

                // Ubah dari String (Huruf) ke Double (Angka Desimal)
                double p = Double.parseDouble(isiPanjang);
                double l = Double.parseDouble(isiLebar);
                double t = Double.parseDouble(isiTinggi);

                // 3. Masukkan Rumus Sesuai Soal
                // Rumus Luas Permukaan = 2 x ((p x l) + (p x t) + (l x t))
                double luas = 2 * ((p * l) + (p * t) + (l * t));

                // Rumus Volume = p x l x t
                double volume = p * l * t;

                // 4. Tampilkan Hasil ke Layar
                luas.setText("Luas Permukaan : " + luas);
                volume.setText("Volume : " + volume);
            }
        });
    }
}