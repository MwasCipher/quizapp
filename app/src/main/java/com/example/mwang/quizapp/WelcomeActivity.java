package com.example.mwang.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        Button enterQuiz = (Button) findViewById(R.id.enterQuiz);
        enterQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accessQuiz = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(accessQuiz);
            }
        });
    }

    public void selected (View view){
        boolean selected = ((CheckBox) view).isChecked();
        Button enterQuiz = (Button) findViewById(R.id.enterQuiz);

        if (selected){
           enterQuiz.setEnabled(true);

            Toast.makeText(this, "You Are Now Clear to Answer Quiz", Toast.LENGTH_SHORT).show();

        }

        else

        {
            enterQuiz.setEnabled(false);
        }
    }

}
