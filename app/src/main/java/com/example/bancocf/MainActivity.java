package com.example.bancocf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bancocf.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.imgSaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent navegarTelaDeSaldo = new Intent(MainActivity.this,  Saldo.class);
                startActivity(navegarTelaDeSaldo);
            }
        });
    }
}