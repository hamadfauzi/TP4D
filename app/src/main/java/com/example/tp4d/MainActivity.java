package com.example.tp4d;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnInformasi,btnPengaduan,btnPermohonan,btnSeputar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);
        initialize();
    }

    private void initialize()
    {
        btnInformasi = (Button) findViewById(R.id.btnInformasi);
        btnPengaduan = (Button) findViewById(R.id.btnPengaduan);
        btnPermohonan = (Button) findViewById(R.id.btnPermohonan);
        btnSeputar = (Button) findViewById(R.id.btnSeputar);

        btnInformasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent informasiIntent = new Intent(MainActivity.this,InformasiBeritaActivity.class);
                startActivity(informasiIntent);
            }
        });
        btnSeputar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent seputarIntent = new Intent(MainActivity.this,SeputarActivity.class);
                startActivity(seputarIntent);
            }
        });
        btnPermohonan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent permohonanIntent = new Intent(MainActivity.this,PermohonanActivity.class);
                startActivity(permohonanIntent);
            }
        });
        btnPengaduan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pengaduanIntent = new Intent(MainActivity.this,PengaduanActivity.class);
                startActivity(pengaduanIntent);
            }
        });

    }



}
