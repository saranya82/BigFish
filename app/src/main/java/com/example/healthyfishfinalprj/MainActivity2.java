package com.example.healthyfishfinalprj;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

   EditText editTextuname;
    private EditText editTextPassword;
    private Button login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextuname = findViewById(R.id.editTextuname);
        editTextPassword = findViewById(R.id.editTextPassword);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextuname.getText().toString();
                String password = editTextPassword.getText().toString();
                if (isValidCredentials(username, password)) {
                    Intent intent = new Intent(MainActivity2.this, Dashboard.class);
                    startActivity(intent);
                    finish();
                } else {
                    System.out.println("Incorrect username or password ");
                }
            }
        });
    }
    private boolean isValidCredentials(String username, String password) {
        return true;
    }
}