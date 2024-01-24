package com.example.bancocf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bancocf.databinding.ActivityMainBinding;
import com.example.bancocf.databinding.ActivityPoupancaBinding;

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
                Intent navergarTelaDeSaldo = new Intent(MainActivity.this, saldo.class);
                startActivity(navergarTelaDeSaldo);
            }
        });

        binding.imgFatura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegarTelaDeFatura = new Intent(MainActivity.this, Faturas.class);
                startActivity(navegarTelaDeFatura);
            }
        });

        binding.imgTransferencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegarTelaDeTransferencia = new Intent(MainActivity.this, Transferencias.class);
                startActivity(navegarTelaDeTransferencia);
            }
        });

        binding.imgPoupanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navegarTelaDePoupanca = new Intent(MainActivity.this, Poupanca.class);
                startActivity(navegarTelaDePoupanca);
            }
        });
    }
}