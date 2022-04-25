package com.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Temp1 extends AppCompatActivity {

    TextView  name_txt,surname_txt,dob_txt,gender_txt,hobbies_txt,mb_txt,email_txt,git_txt,
            link_txt,add_txt,skill1_txt,skill2_txt,skill3_txt,skill4_txt,
            skill5_txt,degree_txt, clg_txt,grade_txt,cmp_txt,start_txt,end_txt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp1);

        name_txt = findViewById(R.id.name_txt);
        surname_txt = findViewById(R.id.surname_txt);
        dob_txt = findViewById(R.id.dob_txt);
        gender_txt = findViewById(R.id.gender_txt);
        hobbies_txt = findViewById(R.id.hobbies_txt);
        mb_txt = findViewById(R.id.mb_txt);
        email_txt = findViewById(R.id.email_txt);
        git_txt = findViewById(R.id.git_txt);
        link_txt = findViewById(R.id.link_txt);
        add_txt = findViewById(R.id.add_txt);
        skill1_txt = findViewById(R.id.skill1_txt);
        skill2_txt = findViewById(R.id.skill2_txt);
        skill3_txt = findViewById(R.id.skill3_txt);
        skill4_txt = findViewById(R.id.skill4_txt);
        skill5_txt = findViewById(R.id.skill5_txt);
        degree_txt = findViewById(R.id.degree_txt);
        clg_txt = findViewById(R.id.clg_txt);
        cmp_txt = findViewById(R.id.cmp_txt);
        start_txt = findViewById(R.id.start_txt);
        end_txt = findViewById(R.id.end_txt);
        grade_txt = findViewById(R.id.grade_txt);


        String name = getIntent().getStringExtra("name");
        name_txt.setText(" "+name);
        String sur = getIntent().getStringExtra("sur");
        surname_txt.setText(" "+sur);
        String dob = getIntent().getStringExtra("dob");
        dob_txt.setText(": "+dob);
        String gender = getIntent().getStringExtra("gender");
        gender_txt.setText(": "+gender);
        String hobby = getIntent().getStringExtra("hobby");
        hobbies_txt.setText(": "+hobby);
        String mb = getIntent().getStringExtra("mb");
        mb_txt.setText(" "+mb);
        String email = getIntent().getStringExtra("email");
        email_txt.setText(" "+email);
        String github = getIntent().getStringExtra("github");
        git_txt.setText(" "+github);
        String linked = getIntent().getStringExtra("linked");
        link_txt.setText(" "+linked);
        String add = getIntent().getStringExtra("add");
        add_txt.setText(" "+add);
        String skill1 = getIntent().getStringExtra("skill1");
        skill1_txt.setText(": "+skill1);
        String skill2 = getIntent().getStringExtra("skill2");
        skill2_txt.setText(": "+skill2);
        String skill3 = getIntent().getStringExtra("skill3");
        skill3_txt.setText(": "+skill3);
        String skill4 = getIntent().getStringExtra("skill4");
        skill4_txt.setText(": "+skill4);
        String skill5 = getIntent().getStringExtra("skill5");
        skill5_txt.setText(": "+skill5);
        String course = getIntent().getStringExtra("course");
        degree_txt.setText("- "+course);
        String school = getIntent().getStringExtra("school");
        clg_txt.setText(": "+school);
        String company = getIntent().getStringExtra("company");
        cmp_txt.setText(" "+company);
        String start = getIntent().getStringExtra("start");
        start_txt.setText(": "+start);
        String end = getIntent().getStringExtra("end");
        end_txt.setText(": "+end);
        String grade = getIntent().getStringExtra("grade");
        grade_txt.setText(": "+grade);
    }
}