package com.example.foodmanagementapp.model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foodmanagementapp.R;

public class LoginActivity extends AppCompatActivity {
    //variable declaration
    private Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //initialising id;
        sign=findViewById(R.id.sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }
    public void register(){
        Intent intent=new Intent(LoginActivity.this,SiginActivity.class);
        startActivity(intent);
        finish();
    }
}