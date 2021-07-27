package com.example.loginlogout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       String s1 = getIntent().getStringExtra("session").toString();
        if (!s1.equals("")) {
            Intent a1 = new Intent(this,Sreen3.class);
            startActivity(a1);
        }

    }

    public void fun1(View view) {
        Intent a1 = new Intent(this,Sreen3.class);
        a1.putExtra("session","user1");
        startActivity(a1);
    }
}