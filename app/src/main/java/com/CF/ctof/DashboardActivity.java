package com.CF.ctof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.cert.Extension;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {

private Button btnTemp, btnSi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnTemp = findViewById(R.id.btnCtoF);
        btnSi = findViewById(R.id.btnSi);

        btnTemp.setOnClickListener(this);
        btnSi.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.btnCtoF){
            Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
            startActivity(intent);



        }

        }
    }

