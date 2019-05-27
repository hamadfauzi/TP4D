package com.example.tp4d;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {

    Button btnDaftar;
    EditText etPassword,etEmail,etNama;
    CheckBox syarat;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initialize();
    }

    private void initialize() {
        etEmail = (EditText) findViewById(R.id.inputEmailRegister);
        etPassword = (EditText) findViewById(R.id.inputPasswordRegister);
        etNama = (EditText) findViewById(R.id.inputNamaRegister);
        syarat = (CheckBox) findViewById(R.id.checkBoxSyarat);
        btnDaftar = (Button) findViewById(R.id.btnRegister);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftarUser();
            }
        });
    }

    private void daftarUser()
    {
        String password = etPassword.getText().toString();
        String nama = etNama.getText().toString();
        String email = etEmail.getText().toString();
        
        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(this, "Masukkan email anda", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(nama))
        {
            Toast.makeText(this, "Masukkan nama anda", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(password))
        {
            Toast.makeText(this, "Masukkan Password Anda", Toast.LENGTH_SHORT).show();
        }
        else if(!syarat.isChecked())
        {
            Toast.makeText(this, "Check Syarat dan Ketentuan", Toast.LENGTH_SHORT).show();
        }
        else
        {
            
        }
    }

}
