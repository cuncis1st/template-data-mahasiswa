package com.reksa.karang.demosqlite1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.btnLihatData) void lihatData() {
        startActivity(new Intent(MainActivity.this, DataMahasiswaActivity.class));
    }

    @OnClick(R.id.btnInputData) void inputData() {
        startActivity(new Intent(MainActivity.this, InputDataActivity.class));
    }

    @OnClick(R.id.btnInformasi) void info() {
        startActivity(new Intent(MainActivity.this, InformasiActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
