package com.example.tp4d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {


    Button btnDaftar,btnMasuk;
    EditText etPassword,etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    private void initialize() {
        btnDaftar = (Button) findViewById(R.id.btnDaftar);
        btnMasuk = (Button) findViewById(R.id.btnMasuk);
        etPassword = (EditText) findViewById(R.id.inputPasswordLogin);
        etEmail = (EditText) findViewById(R.id.inputEmailLogin);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                keDaftarActivity();
            }
        });
        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });
    }

    private void loginUser() {
        String password = etPassword.getText().toString();
        String email = etEmail.getText().toString();

        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "Masukkan Email Anda", Toast.LENGTH_SHORT).show();
        }
        else if (TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Masukkan Password Anda", Toast.LENGTH_SHORT).show();
        }
        else
        {

        }
    }

    private void keDaftarActivity() {
        Intent loginIntent = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(loginIntent);
        finish();
    }


}
