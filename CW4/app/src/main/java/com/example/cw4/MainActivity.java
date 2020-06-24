package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText x = findViewById(R.id.numberone);
        final EditText y = findViewById(R.id.numbertwo);
        Button a = findViewById(R.id.add);
        Button s = findViewById(R.id.subtract);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numberone = Double.parseDouble(x.getText().toString());
                double numbertwo = Double.parseDouble(y.getText().toString());
                double result = numberone + numbertwo;
                Toast.makeText(MainActivity.this, "the addition is: " + result, Toast.LENGTH_LONG).show();
            }
        });

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double numberone = Double.parseDouble(x.getText().toString());
                double numbertwo = Double.parseDouble(y.getText().toString());
                double result = numberone - numbertwo;
                Toast.makeText(MainActivity.this, "the subtraction is: " + result, Toast.LENGTH_LONG).show();
            }

        });
    }
}