package com.example.sewa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BilUtiliti extends AppCompatActivity {

    ImageView mBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bil_utiliti);

        mBack = findViewById(R.id.navigator);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(BilUtiliti.this, Dashboard.class);
                startActivity(x);
            }
        });

    }
}