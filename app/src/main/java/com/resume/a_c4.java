package com.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class a_c4 extends AppCompatActivity {

    EditText skill1,skill2,skill3,skill4,skill5;
    Button next4,back4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac4);

        skill1 = findViewById(R.id.skill1);
        skill2 = findViewById(R.id.skill3);
        skill3 = findViewById(R.id.skill3);
        skill4 = findViewById(R.id.skill4);
        skill5 = findViewById(R.id.skill5);
        next4 = findViewById(R.id.next4);
        back4 = findViewById(R.id.back4);

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
        String co = getIntent().getStringExtra("company");
        String st = getIntent().getStringExtra("start");
        String en = getIntent().getStringExtra("end");
        String a = getIntent().getStringExtra("add");

        back4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = skill1.getText().toString();
                String s2 = skill2.getText().toString();
                String s3 = skill3.getText().toString();
                String s4 = skill4.getText().toString();
                String s5 = skill5.getText().toString();


                Intent intent = new Intent(a_c4.this,a_c5.class);
                intent.putExtra("skill1",s1);
                intent.putExtra("skill2",s2);
                intent.putExtra("skill3",s3);
                intent.putExtra("skill4",s4);
                intent.putExtra("skill5",s5);

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

                intent.putExtra("company",co);
                intent.putExtra("start",st);
                intent.putExtra("end",en);

                startActivity(intent);

            }
        });


    }
}