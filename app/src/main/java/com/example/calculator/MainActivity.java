package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNilaiA, editNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNilaiA = findViewById(R.id.editNilaiA);
        editNilaiB = findViewById(R.id.editNilaiB);
        txtHasil = findViewById(R.id.txtHasil);
        btnTambah = findViewById(R.id.btnTambah);
        btnKurang = findViewById(R.id.btnKurang);
        btnKali = findViewById(R.id.btnKali);
        btnBagi = findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());
                int hasil = nilaiA + nilaiB;
                txtHasil.setText(String.valueOf("hasil = " + hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());
                int hasil = nilaiA - nilaiB;
                txtHasil.setText(String.valueOf("hasil = " + hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());
                int hasil = nilaiA * nilaiB;
                txtHasil.setText(String.valueOf("hasil = " + hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nilaiA = Integer.parseInt(editNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(editNilaiB.getText().toString());
                int hasil = nilaiA / nilaiB;
                txtHasil.setText(String.valueOf("hasil = " + hasil));
            }
        });
    }
}