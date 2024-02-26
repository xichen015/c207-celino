package com.example.c207_celino;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import android.os.Bundle;

public class question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        RadioGroup answers = findViewById(R.id.answerG3);
        Button button4 = findViewById(R.id.button4);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(question3.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonid = answers.getCheckedRadioButtonId();
                if (selectedRadioButtonid != -1) {
                    RadioButton selectedRB = findViewById(selectedRadioButtonid);
                    Toast.makeText(question3.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                    if (selectedRB.getText().toString().equals("2008")) {

                        Toast.makeText(question3.this, "Youve got the correct answer", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(question3.this, question4.class);

                        intent.putExtra("name", "Hervine"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(question3.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(question3.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(question3.this, "No option selected", Toast.LENGTH_SHORT).show();
                }


            }

        });
    }
}

