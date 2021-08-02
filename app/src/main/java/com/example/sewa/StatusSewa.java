package com.example.sewa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StatusSewa extends AppCompatActivity {

    ImageView mBack;
    TextView mStatusDeposit;

    ImageView mDoneDepo;
    ImageView mDone7;
    ImageView mDone8;
    ImageView mDone9;
    ImageView mDone10;
    ImageView mDone11;
    ImageView mDone12;
    ImageView mDone1;


    LinearLayout mLinearDepo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_sewa);

        mBack = findViewById(R.id.navigator);
        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(StatusSewa.this, Dashboard.class);
                startActivity(x);
            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Monthly/Deposit");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                mStatusDeposit = findViewById(R.id.statusdeposit);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.lineardepo);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.doneDepo);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.lineardepo);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.doneDepo);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        DatabaseReference data7 = database.getReference("Monthly/7");
        data7.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.linear7);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.done7);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.linear7);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.done7);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        DatabaseReference data8 = database.getReference("Monthly/8");
        data8.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.linear8);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.done8);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.linear8);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.done8);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        DatabaseReference data9 = database.getReference("Monthly/9");
        data9.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.linear9);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.done9);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.linear9);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.done9);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        DatabaseReference data10 = database.getReference("Monthly/10");
        data10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.linear10);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.done10);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.linear10);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.done10);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });


        DatabaseReference data11 = database.getReference("Monthly/11");
        data11.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.linear11);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.done11);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.linear11);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.done11);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });

        DatabaseReference data12 = database.getReference("Monthly/12");
        data12.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.linear12);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.done12);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.linear12);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.done12);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });


        DatabaseReference data1 = database.getReference("Monthly/1");
        data1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);

                assert value != null;
                if (value.equals("Done")){
                    mLinearDepo = findViewById(R.id.linear1);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.donecolor));
                    mDoneDepo = findViewById(R.id.done1);
                    mDoneDepo.setBackgroundResource(R.drawable.done);
                }
                if (value.equals("Pending")){
                    mLinearDepo = findViewById(R.id.linear1);
                    mLinearDepo.setBackgroundColor(getResources().getColor(R.color.pendingcolor));
                    mDoneDepo = findViewById(R.id.done1);
                    mDoneDepo.setBackgroundResource(R.drawable.x);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });




    }
}