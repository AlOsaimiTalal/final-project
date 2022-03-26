package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class billPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_page);
        getSupportActionBar().hide();

        Button buyB1= findViewById(R.id.button5);


        buyB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotUr1("https://www.amazon.com/Thousand-Brains-New-Theory-Intelligence/dp/1541675819");
            }
        });

    }

    private void gotUr1(String s) {

        Uri uri = Uri.parse(s);
        Intent amazonB1 = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(amazonB1);
    }
}