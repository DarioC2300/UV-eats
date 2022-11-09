package com.example.uv_eats.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.example.uv_eats.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.ButtonLogin.setOnClickListener(v ->{
            String username = binding.TextUser.toString();
            String password = binding.TextPassword.toString();
        });

        binding.ButtonRecoverPassword.setOnClickListener(v -> {

        });
    }


}
