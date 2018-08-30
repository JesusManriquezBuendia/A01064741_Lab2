package com.example.jesus_pc.lab2_a01064741;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PAGE2 extends AppCompatActivity {

    private TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        txtView = findViewById(R.id.txtAcquired);
        Intent myOtherIntent = getIntent();
        String myString = myOtherIntent.getStringExtra("Str");
        txtView.setText(myString);

    }
}
