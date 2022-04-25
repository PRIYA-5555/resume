package com.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class a_c2 extends AppCompatActivity {
EditText course,school,grade;
Button next2,back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);
        course = findViewById(R.id.course);
        school = findViewById(R.id.school);
        grade = findViewById(R.id.grade);
        next2 = findViewById(R.id.next2);
        back2 = findViewById(R.id.back2);

    String n = getIntent().getStringExtra("name");
    String s = getIntent().getStringExtra("sur");
    String d = getIntent().getStringExtra("dob");
    String e = getIntent().getStringExtra("email");
    String m = getIntent().getStringExtra("mb");
    String h = getIntent().getStringExtra("hobby");
    String a = getIntent().getStringExtra("add");
    String ge = getIntent().getStringExtra("gender");


    back2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finish();
        }
    });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String c = course.getText().toString();
                String s = school.getText().toString();
                String g = grade.getText().toString();

                Intent intent = new Intent(a_c2.this,a_c3.class);
                intent.putExtra("course",c);
                intent.putExtra("school",s);
                intent.putExtra("grade",g);
                intent.putExtra("name",n);
                intent.putExtra("sur",s);
                intent.putExtra("dob",d);
                intent.putExtra("email",e);
                intent.putExtra("mb",m);
                intent.putExtra("hobby",h);
                intent.putExtra("gender",ge);
                intent.putExtra("add",a);
                 startActivity(intent);

            }
        });
    }
}