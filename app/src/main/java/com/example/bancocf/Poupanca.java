package com.example.bancocf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bancocf.databinding.ActivityMainBinding;
import com.example.bancocf.databinding.ActivityPoupancaBinding;

public class Poupanca extends AppCompatActivity {
    private ActivityPoupancaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityPoupancaBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.ToolbarPoupanca.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarTelaPrincipal = new Intent(Poupanca.this, MainActivity.class);
                startActivity(voltarTelaPrincipal);
            }
        });

    }
}