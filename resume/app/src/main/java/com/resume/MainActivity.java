package com.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CheckBox c1,c2,c3,c4;
    EditText name,sur,dob,email,mb,add;
    RadioGroup gender;
    Button next;
    List hobbyList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        add = findViewById(R.id.add);
        gender = findViewById(R.id.gender);
        name = findViewById(R.id.name);
        dob = findViewById(R.id.dob);
        sur = findViewById(R.id.sur);
        email = findViewById(R.id.email);
        mb = findViewById(R.id.mb);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hobbyList.clear();

                if (c1.isChecked()){
                    hobbyList.add("Reading");
                }
                if (c2.isChecked()){
                    hobbyList.add("Singing");
                }
                if (c3.isChecked()){
                    hobbyList.add("Gaming");
                }
                if (c4.isChecked()){
                    hobbyList.add("Coding");
                }
                String hobby = "";
                for (int i = 0; i < hobbyList.size(); i++) {
                    hobby += hobbyList.get(i).toString()+"\n";
                }
                String n = name.getText().toString();
                String s = sur.getText().toString();
                String d = dob.getText().toString();
                String e = email.getText().toString();
                String m = mb.getText().toString();
                String a = add.getText().toString();

                int id = gender.getCheckedRadioButtonId();
                RadioButton button = findViewById(id);

                Intent intent = new Intent(MainActivity.this,a_c2.class);
                intent.putExtra("name",n);
                intent.putExtra("sur",s);
                intent.putExtra("dob",d);
                intent.putExtra("email",e);
                intent.putExtra("mb",m);
                intent.putExtra("add",a);
                intent.putExtra("hobby",hobby);
                intent.putExtra("gender",button.getText().toString());
                startActivity(intent);
            }
        });



    }



    

}