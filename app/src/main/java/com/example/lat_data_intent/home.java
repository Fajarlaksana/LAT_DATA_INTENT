package com.example.lat_data_intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity implements View.OnClickListener {

protected void onCreate (Bundle saveInstanceState){
        ImageView food;
        super.onCreate(saveInstanceState);
        setContentView(R.layout.home);
        food = (ImageView) findViewById(R.id.food);
        food.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
                switch (view.getId()) {
                case R.id.food:

                Intent makan = new Intent(home.this, food_activity.class);
                startActivity(makan);
                break;
                default:
                break;
        }
      }
    }