package com.example.bancocf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bancocf.databinding.ActivitySaldoBinding;

public class saldo extends AppCompatActivity {
    private ActivitySaldoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivitySaldoBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarSaldo.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarTelaPrincipal = new Intent(saldo.this, MainActivity.class);
                startActivity(voltarTelaPrincipal);
            }
        });

    }
}