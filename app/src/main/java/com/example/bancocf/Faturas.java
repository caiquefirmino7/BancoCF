package com.example.bancocf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bancocf.databinding.ActivityFaturasBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Faturas extends AppCompatActivity {
    private ActivityFaturasBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltarTelaPrincipal = new Intent(Faturas.this, MainActivity.class);
                startActivity(voltarTelaPrincipal);
            }
        });

        CreditCardView cartaoDeCredito = binding.cartaoCredito;
        cartaoDeCredito.setCardNumber("4385 6877 2864 1298");
        cartaoDeCredito.setCardName("Caique F Do E Santo");
        cartaoDeCredito.setExpiryDate("11/29");
        cartaoDeCredito.setType(CardType.MASTERCARD);

    }
}