package com.example.uv_eats.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

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
            String username = String.valueOf(binding.TextUser.getText());
            String password = String.valueOf(binding.TextPassword.getText());
            Toast.makeText(MainActivity.this, "Username:" + username + " Password:" + password.toString(), Toast.LENGTH_LONG).show();
        });

        binding.ButtonRecoverPassword.setOnClickListener(v ->{
            startScoreActivityRecoverPassword();
        });

        binding.ButtonSignIn.setOnClickListener(v ->{
            startScoreActivitySignIn();
        });
    }


    private void startScoreActivityRecoverPassword(){
        Intent intent = new Intent(this, RecoverPassword.class);
        startActivity(intent);
    }

    private void startScoreActivitySignIn(){
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }

}
