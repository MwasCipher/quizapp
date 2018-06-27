package com.example.mwang.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int rsvpPoints = 0;
    int mosesPoints = 0;
    int seriesPoints = 0;
    int oppositePoints = 0;
    int agePoints = 0;
    int groupPoints = 0;
    int forkPoints = 0;
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void clickTrue(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.radio_true_speed:

                if (checked){

                    Toast.makeText(this, "You Can Only Make This Choice Once.....Reset to Retry", Toast.LENGTH_SHORT).show();
                    return;

                }else

                    {
                    score = score + 1;

                    }


                break;

            case R.id.radio_true_rsvp:

                if (checked){

                    Toast.makeText(this, "You Can Only Make This Choice Once.....Reset to Retry", Toast.LENGTH_SHORT).show();
                    return;

                }else

                    {
                    score = score + 1;

                    }
                break;

            case R.id.radio_true_moses:

                if (checked){
                    score = score + 1;
                }
                break;

            case R.id.radio_true_series:

                if (checked){
                    score = score + 1;
                }
                break;


            case R.id.radio_true_opposite:

                if (checked){
                    score= score + 1;
                }
                break;

            case R.id.radio_true_age:

                if (checked){
                    score = score + 1;
                }
                break;

            case R.id.radio_true_group:

                if (groupPoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    score = score + 1;
                }
                break;

            case R.id.radio_true_fork:

                if (forkPoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    score= score + 1;
                }
                break;


        }


    }


    public void clickFalse(View view){

        boolean checked = ((RadioButton) view).isChecked();







        switch (view.getId()){

            case R.id.radio_false_speed:



                if (checked){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }else
                    {
                    score = score + 0 ;
                    }
                break;

            case R.id.radio_false_rsvp:

                if (checked==checked){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    rsvpPoints = rsvpPoints + 0 ;
                }
                break;

            case R.id.radio_false_moses:

                if (mosesPoints==0){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    mosesPoints = mosesPoints + 0;
                }
                break;

            case R.id.radio_false_series:

                if (seriesPoints==0){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    seriesPoints = seriesPoints + 0;
                }
                break;


            case R.id.radio_false_opposite:

                if (oppositePoints==0){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    oppositePoints = oppositePoints + 0;
                }
                break;

            case R.id.radio_false_age:

                if (agePoints==0){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    agePoints =agePoints + 0;
                }
                break;

            case R.id.radio_false_group:

                if (groupPoints==0){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    groupPoints = groupPoints + 0;
                }
                break;

            case R.id.radio_false_fork:

                if (forkPoints==0){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset to Try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    score= forkPoints + 0;

                }
                break;
        }
    }


    public void reset(View view){

        score = 0;
        rsvpPoints = 0;
        mosesPoints = 0;
        seriesPoints = 0;
        oppositePoints = 0;
        agePoints = 0;
        groupPoints = 0;
        forkPoints = 0;


        TextView summaryView = (TextView) findViewById(R.id.scoreSummaryTextView);
        summaryView.setText(" ");

        EditText name = (EditText)findViewById(R.id.enterName);
        name.setText(" ");

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rg1);
        radioGroup.clearCheck();

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.rg2);
        radioGroup1.clearCheck();

        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.rg3);
        radioGroup2.clearCheck();

        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.rg4);
        radioGroup3.clearCheck();

        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.rg5);
        radioGroup4.clearCheck();

        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.rg6);
        radioGroup5.clearCheck();

        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.rg7);
        radioGroup6.clearCheck();

        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.rg8);
        radioGroup7.clearCheck();

    }



    public void testSummary(View view){

        EditText enterName = (EditText) findViewById(R.id.enterName);
        enterName.getText().toString();
        String name = enterName.getText().toString();

        String summaryScore = createTestSummary(name, score);

        TextView score = (TextView) findViewById(R.id.scoreSummaryTextView);
        score.setText(summaryScore);



    }

    public String createTestSummary( String name, int score ){
        String summaryScore = "Name: "+ name + "\nTotal Score: " + score;
        return summaryScore;
    }




}
