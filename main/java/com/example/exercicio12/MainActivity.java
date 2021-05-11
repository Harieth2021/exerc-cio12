package com.example.exercicio12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_username, password;
    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username=findViewById(R.id.et_user);
        password=findViewById(R.id.et_pass);
        btn_login=findViewById(R.id.bt_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= et_username.getText().toString();
                String passwordn =password.getText().toString();

                if (username.equals("user") && passwordn.equals("pass")){
                    Toast.makeText(MainActivity.this, "Login válido!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login inválido!", Toast.LENGTH_SHORT).show();
                }
                et_username.setText("");
                password.setText("");

            }
        });
    }
}