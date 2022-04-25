package com.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class a_c6 extends AppCompatActivity {

    EditText companyname,weblink;
    Button next6,back6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac6);

       companyname = findViewById(R.id.companyname);
       weblink = findViewById(R.id.weblink);
       next6 = findViewById(R.id.next6);
       back6 = findViewById(R.id.back6);
        String a = getIntent().getStringExtra("add");
        String en = getIntent().getStringExtra("end");
        String s1 = getIntent().getStringExtra("skill1");
        String s2 = getIntent().getStringExtra("skill2");
        String s3 = getIntent().getStringExtra("skill3");
        String s4 = getIntent().getStringExtra("skill14");
        String s5 = getIntent().getStringExtra("skill5");
        String git = getIntent().getStringExtra("github");
        String link = getIntent().getStringExtra("linked");
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


       back6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               finish();
           }
       });

       next6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {


               String web = weblink.getText().toString();
               String company = companyname.getText().toString();


               Intent intent = new Intent(a_c6.this,Templats.class);
               intent.putExtra("weblink",web);
               intent.putExtra("com",company);

               intent.putExtra("github",git);
               intent.putExtra("linked",link);

               intent.putExtra("skill1",s1);
               intent.putExtra("skill2",s2);
               intent.putExtra("skill3",s3);
               intent.putExtra("skill4",s4);
               intent.putExtra("skill5",s5);

               intent.putExtra("add",a);
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

               intent.putExtra("company",co);
               intent.putExtra("start",st);
               intent.putExtra("end",en);
               startActivity(intent);


           }
       });
    }
}