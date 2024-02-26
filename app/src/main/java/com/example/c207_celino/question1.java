package com.example.c207_celino;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import android.os.Bundle;

public class question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        RadioGroup answers = findViewById(R.id.answerG1);
        Button button2 = findViewById(R.id.button2);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(question1.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonid = answers.getCheckedRadioButtonId();
                if (selectedRadioButtonid != -1) {
                    RadioButton selectedRB = findViewById(selectedRadioButtonid);
                    Toast.makeText(question1.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                    if (selectedRB.getText().toString().equals("Martin Cooper")) {

                        Toast.makeText(question1.this, "Youve got the correct answer", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(question1.this, question2.class);

                        intent.putExtra("name", "Hervine"); //Pass data to other intent
                        startActivity(intent);
                        }else{
                        Toast.makeText(question1.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                        }
                    Toast.makeText(question1.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                        }else{
                    Toast.makeText(question1.this, "No option selected", Toast.LENGTH_SHORT).show();
                    }


                }

            });
        }
    }