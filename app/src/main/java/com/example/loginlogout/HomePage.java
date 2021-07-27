package com.example.loginlogout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void fun2(View view) {
        Intent a1 = new Intent(this,MainActivity.class);
        a1.putExtra("session","");
        startActivity(a1);
    }

    public void fun3(View view) {
        try{
            getIntent().getStringExtra("session");
        }
        catch (Exception e){
            Intent a1 = new Intent(this,MainActivity.class);
            a1.putExtra("session","");
            startActivity(a1);
        }
    }
}