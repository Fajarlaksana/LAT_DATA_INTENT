package com.example.lat_data_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class isi_activity extends AppCompatActivity implements View.OnClickListener {
    String namaisi,alamatisi,pesananisi;
    TextView txnama,txalamat,txpesanan;
    protected void onCreate (Bundle saveInstanceState){
        Button button ;
        super.onCreate(saveInstanceState);
        setContentView(R.layout.food_isi);
        txnama = (TextView) findViewById(R.id.textView8);
        txalamat = (TextView) findViewById(R.id.textView9);
        txpesanan = (TextView) findViewById(R.id.textView10);
        namaisi = getIntent().getStringExtra("nama");
        alamatisi = getIntent().getStringExtra("alamat");
        pesananisi = getIntent().getStringExtra("pesanan");
        txnama.setText(namaisi);
        txalamat.setText(alamatisi);
        txpesanan.setText(pesananisi);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:

                Intent batal = new Intent(isi_activity.this, home.class);
                startActivity(batal);
                break;
            default:
                break;
        }
    }
}
