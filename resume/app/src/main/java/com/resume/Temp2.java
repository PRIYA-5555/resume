package com.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Temp2 extends AppCompatActivity {
    TextView name_txt2,surname_txt2,dob_txt2,gender_txt2,hobbies_txt2,mb_txt2,email_txt2,git_txt2,
            link_txt2,add_txt2,skill1_txt2,skill2_txt2,skill3_txt2,skill4_txt2,
            skill5_txt2,degree_txt2, clg_txt2,grade_txt2,cmp_txt2,start_txt2,end_txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp2);


        name_txt2 = findViewById(R.id.name_txt2);
        surname_txt2 = findViewById(R.id.surname_txt2);
        dob_txt2 = findViewById(R.id.dob_txt2);
        gender_txt2 = findViewById(R.id.gender_txt2);
        hobbies_txt2 = findViewById(R.id.hobbies_txt2);
        mb_txt2 = findViewById(R.id.mb_txt2);
        email_txt2 = findViewById(R.id.email_txt2);
        git_txt2 = findViewById(R.id.git_txt2);
        link_txt2 = findViewById(R.id.link_txt2);
        add_txt2 = findViewById(R.id.add_txt2);
        skill1_txt2 = findViewById(R.id.skill1_txt2);
        skill2_txt2 = findViewById(R.id.skill2_txt2);
        skill3_txt2 = findViewById(R.id.skill3_txt2);
        skill4_txt2 = findViewById(R.id.skill4_txt2);
        skill5_txt2 = findViewById(R.id.skill5_txt2);
        degree_txt2 = findViewById(R.id.degree_txt2);
        clg_txt2 = findViewById(R.id.clg_txt2);
        cmp_txt2 = findViewById(R.id.cmp_txt2);
        start_txt2 = findViewById(R.id.start_txt2);
        end_txt2 = findViewById(R.id.end_txt2);
        grade_txt2 = findViewById(R.id.grade_txt2);



        String name = getIntent().getStringExtra("name");
        name_txt2.setText(" "+name);
        String sur = getIntent().getStringExtra("sur");
        surname_txt2.setText(" "+sur);
        String dob = getIntent().getStringExtra("dob");
        dob_txt2.setText(": "+dob);
        String gender = getIntent().getStringExtra("gender");
        gender_txt2.setText(": "+gender);
        String hobby = getIntent().getStringExtra("hobby");
        hobbies_txt2.setText(": "+hobby);
        String mb = getIntent().getStringExtra("mb");
        mb_txt2.setText(" "+mb);
        String email = getIntent().getStringExtra("email");
        email_txt2.setText(" "+email);
        String github = getIntent().getStringExtra("github");
        git_txt2.setText(" "+github);
        String linked = getIntent().getStringExtra("linked");
        link_txt2.setText(" "+linked);
        String add = getIntent().getStringExtra("add");
        add_txt2.setText(" "+add);
        String skill1 = getIntent().getStringExtra("skill1");
        skill1_txt2.setText(": "+skill1);
        String skill2 = getIntent().getStringExtra("skill2");
        skill2_txt2.setText(": "+skill2);
        String skill3 = getIntent().getStringExtra("skill3");
        skill3_txt2.setText(": "+skill3);
        String skill4 = getIntent().getStringExtra("skill4");
        skill4_txt2.setText(": "+skill4);
        String skill5 = getIntent().getStringExtra("skill5");
        skill5_txt2.setText(": "+skill5);
        String course = getIntent().getStringExtra("course");
        degree_txt2.setText("- "+course);
        String school = getIntent().getStringExtra("school");
        clg_txt2.setText(": "+school);
        String company = getIntent().getStringExtra("company");
        cmp_txt2.setText(" "+company);
        String start = getIntent().getStringExtra("start");
        start_txt2.setText(": "+start);
        String end = getIntent().getStringExtra("end");
        end_txt2.setText(": "+end);
        String grade = getIntent().getStringExtra("grade");
        grade_txt2.setText(": "+grade);

    }
}