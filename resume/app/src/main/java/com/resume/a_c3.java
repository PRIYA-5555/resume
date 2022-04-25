package com.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class a_c3 extends AppCompatActivity {

    EditText company,start,end;
    Button next3,back3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac3);

        company = findViewById(R.id.company);
        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        next3 = findViewById(R.id.next3);
        back3 = findViewById(R.id.back3);

        String n = getIntent().getStringExtra("name");
        String sur = getIntent().getStringExtra("sur");
        String d = getIntent().getStringExtra("dob");
        String email = getIntent().getStringExtra("email");
        String m = getIntent().getStringExtra("mb");
        String h = getIntent().getStringExtra("hobby");
        String g = getIntent().getStringExtra("gender");
        String course = getIntent().getStringExtra("course");
        String l = getIntent().getStringExtra("school");
        String gr = getIntent().getStringExtra("grade");
        String a = getIntent().getStringExtra("add");

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String c = company.getText().toString();
                String s = start.getText().toString();
                String e = end.getText().toString();


                Intent intent = new Intent(a_c3.this,a_c4.class);
                intent.putExtra("company",c);
                intent.putExtra("start",s);
                intent.putExtra("end",e);


                intent.putExtra("course",course);
                intent.putExtra("school",l);
                intent.putExtra("grade",gr);
                intent.putExtra("name",n);
                intent.putExtra("sur",sur);
                intent.putExtra("dob",d);
                intent.putExtra("email",email);
                intent.putExtra("mb",m);
                intent.putExtra("hobby",h);
                intent.putExtra("gender",g);
                intent.putExtra("add",a);
                startActivity(intent);
            }
        });
    }
}