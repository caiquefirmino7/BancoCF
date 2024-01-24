package com.example.bancocf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bancocf.databinding.ActivityMainBinding;
import com.example.bancocf.databinding.ActivityTransferenciasBinding;

public class Transferencias extends AppCompatActivity {
    private ActivityTransferenciasBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityTransferenciasBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarTransferencias.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarTelaPrincipal = new Intent(Transferencias.this, MainActivity.class);
                startActivity(voltarTelaPrincipal);
            }
        });
    }
}