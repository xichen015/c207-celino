package com.example.c207_celino;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;


import android.os.Bundle;

public class question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        RadioGroup answers = findViewById(R.id.answerG4);
        Button button5 = findViewById(R.id.button5);
        String receivedData = getIntent().getStringExtra("name");
        Toast.makeText(question4.this, "Selected: " + "Hello " + receivedData, Toast.LENGTH_SHORT).show();

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedRadioButtonid = answers.getCheckedRadioButtonId();
                if (selectedRadioButtonid != -1) {
                    RadioButton selectedRB = findViewById(selectedRadioButtonid);
                    Toast.makeText(question4.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                    if (selectedRB.getText().toString().equals("09 23 2008")) {

                        Toast.makeText(question4.this, "Youve got the correct answer", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(question4.this, question5.class);

                        intent.putExtra("name", "Hervine"); //Pass data to other intent
                        startActivity(intent);
                    }else{
                        Toast.makeText(question4.this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    }
                    Toast.makeText(question4.this, "Selected: " + selectedRB.getText(), Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(question4.this, "No option selected", Toast.LENGTH_SHORT).show();
                }


            }

        });
    }
}
