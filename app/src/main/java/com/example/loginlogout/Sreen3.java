package com.example.loginlogout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sreen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sreen3);

        try{
            getIntent().getStringExtra("session");
        }
        catch (Exception e){
            Intent a1 = new Intent(this,MainActivity.class);
            a1.putExtra("session","");
            startActivity(a1);
        }
    }

    public void fun3(View view) {
        String s3 = getIntent().getStringExtra("session").toString();
        if (!s3.equals("")) {
            TextView t1 = (TextView)findViewById(R.id.tv1);
            t1.setText("You are already registered with application");
        }
    }
}