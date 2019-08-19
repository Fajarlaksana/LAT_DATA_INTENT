package com.example.lat_data_intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class food_activity extends AppCompatActivity implements View.OnClickListener {
    EditText nama,alamat,pesanan;

    protected void onCreate (Bundle saveInstanceState){
        Button button2 ;
        super.onCreate(saveInstanceState);
        setContentView(R.layout.food);
        nama = (EditText) findViewById(R.id.editText);
        alamat = (EditText) findViewById(R.id.editText2);
        pesanan = (EditText) findViewById(R.id.editText3);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button2:

                Intent order = new Intent(food_activity.this, isi_activity.class);
                order.putExtra("nama",nama.getText().toString());
                order.putExtra("alamat",alamat.getText().toString());
                order.putExtra("pesanan",pesanan.getText().toString());
                startActivity(order);
                break;
            default:
                break;
        }
    }
}

