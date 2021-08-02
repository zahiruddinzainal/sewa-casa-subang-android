package com.example.sewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    CardView xStatus;
    CardView xUtiliti;
    CardView xNomborbank;
    CardView xResitSewa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        xStatus = findViewById(R.id.status);
        xStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Dashboard.this, StatusSewa.class);
                startActivity(x);
            }
        });

        xUtiliti = findViewById(R.id.utiliti);
        xUtiliti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Dashboard.this, BilUtiliti.class);
                startActivity(x);
            }
        });

        xNomborbank = findViewById(R.id.nomborbank);
        xNomborbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Dashboard.this, NomborBank.class);
                startActivity(x);
            }
        });

        xResitSewa = findViewById(R.id.resitsewa);
        xResitSewa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(Dashboard.this, ResiitSewa.class);
                startActivity(x);
            }
        });

    }
}