package com.example.jesus_pc.lab2_a01064741;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.content.Intent;



public class Lab2A01064741 extends AppCompatActivity {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private TextView title;
    private EditText fill;

    String myString;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_a01064741);

        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        title = findViewById(R.id.txtVw);
        fill = findViewById(R.id.editText);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            myString = fill.getText().toString();
            Intent p1 = new Intent(Lab2A01064741.this, PAGE2.class);
            p1.putExtra("Str", myString);

            startActivity(p1);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent p2 = new Intent(Lab2A01064741.this, PAGE3.class);
            startActivity(p2);

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            i++;
            title.setText("You clicked button 3: " + i + " times");

            }
        });
    }
}
