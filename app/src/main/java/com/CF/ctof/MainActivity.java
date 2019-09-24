package com.CF.ctof;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ettemp;
    private Button btnCel, btnFah;
    int temp, result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ettemp = findViewById(R.id.etTemp);
        btnCel = findViewById(R.id.btnCel);
        btnFah = findViewById(R.id.btnFah);

        btnCel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = Integer.parseInt(ettemp.getText().toString());
                result = (temp-32)*5/9;
                Toast.makeText(MainActivity.this, "The temperature in Celsius is "+result + "°C", Toast.LENGTH_SHORT).show();
            }
        });
        btnFah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                temp = Integer.parseInt(ettemp.getText().toString());
                result = ((temp*9/5)+32);
                Toast.makeText(MainActivity.this, "The temperature in Fahrenheit is "+result + "°F", Toast.LENGTH_SHORT).show();
            }
        });

    }
}


