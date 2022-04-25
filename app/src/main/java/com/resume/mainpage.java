package com.resume;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(mainpage.this,MainActivity.class));
                finish();
            }
            
        },2000);
    }
}