package com.example.mwang.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int rsvpPoints = 0;
    int speedPoints = 0;
    int mosesPoints = 0;
    int seriesPoints = 0;
    int oppositePoints = 0;
    int agePoints = 0;
    int groupPoints = 0;
    int forkPoints = 0;
    int nigerPoints = 0;
    int nilePoint = 0;
    int orangePoints = 0;
    int sepikPoints = 0;
    int jupiterPoints = 0;
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

                if (speedPoints==1){

                    Toast.makeText(this, "You Can Only Make This Choice Once.....Reset to Retry", Toast.LENGTH_SHORT).show();
                    return;

                }

                if(checked)

                    {
                    speedPoints = speedPoints + 1;

                    }


                break;

            case R.id.radio_true_rsvp:

                if (rsvpPoints==1){

                    Toast.makeText(this, "You Can Only Make This Choice Once.....Reset to Retry", Toast.LENGTH_SHORT).show();
                    return;

                }
                    if(checked)

                    {
                    rsvpPoints = rsvpPoints + 1;

                    }
                break;

            case R.id.radio_true_moses:

                if (mosesPoints==1){

                    Toast.makeText(this, "You Can Only Make This Choice Once.....Reset to Retry", Toast.LENGTH_SHORT).show();
                    return;

                }

                if (checked)
                {
                    mosesPoints = mosesPoints + 1;
                }
                break;

            case R.id.radio_true_series:

                if (seriesPoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    seriesPoints = seriesPoints + 1;
                }
                break;


            case R.id.radio_true_opposite:

                if (oppositePoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    oppositePoints= oppositePoints + 1;
                }
                break;

            case R.id.radio_true_age:

                if (agePoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    agePoints = agePoints + 1;
                }
                break;

            case R.id.radio_true_group:

                if (groupPoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    groupPoints = groupPoints + 1;
                }
                break;

            case R.id.radio_true_fork:

                if (forkPoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (checked){
                    forkPoints= forkPoints + 1;
                }
                break;



        }


    }

    public void boxClickTrue (View view){

        boolean boxChecked = ((CheckBox) view).isChecked();

        switch (view.getId()){

            case R.id.chkNiger:

                if (nigerPoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }



                if (boxChecked){
                    nigerPoints = nigerPoints + 1;
                }
                break;

            case R.id.chkNile:

                if (nilePoint == 1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }
                if (boxChecked){
                    nilePoint = nilePoint + 1;
                }
                break;

            case R.id.chkOrange:

                if (orangePoints==1){

                    Toast.makeText(this, "You can only Answer One Time....Please Reset To try Again", Toast.LENGTH_SHORT).show();

                    return;
                }

                if (boxChecked){
                    orangePoints = orangePoints + 1;
                }
                break;
        }
    }


    public void clickFalse(View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.radio_false_speed:

                if (checked)
                    {
                    speedPoints = speedPoints + 0 ;


                    }
                break;

            case R.id.radio_false_rsvp:

                if (checked){
                    rsvpPoints = rsvpPoints + 0 ;
                }
                break;

            case R.id.radio_false_moses:

                if (checked){
                    mosesPoints = mosesPoints + 0;
                }
                break;

            case R.id.radio_false_series:

                if (checked){
                    seriesPoints = seriesPoints + 0;
                }
                break;


            case R.id.radio_false_opposite:

                if (checked){
                    oppositePoints = oppositePoints + 0;
                }
                break;

            case R.id.radio_false_age:

                if (checked){
                    agePoints = agePoints + 0;
                }
                break;

            case R.id.radio_false_group:

                if (checked){
                    groupPoints = groupPoints + 0;
                }
                break;

            case R.id.radio_false_fork:

                if (checked){
                    forkPoints = forkPoints + 0;

                }
                break;
        }
    }

    public void boxClickFalse(View view){

        boolean boxChecked = ((CheckBox)view).isChecked();

        switch (view.getId()){

            case R.id.chkSepik:
                if (boxChecked)
                {

                    sepikPoints = sepikPoints + 0;
                }
                break;
        }
    }

    public void testSummary(View view){

        score = rsvpPoints + speedPoints + mosesPoints + agePoints + forkPoints + seriesPoints + oppositePoints + groupPoints + nilePoint + nigerPoints + orangePoints + sepikPoints + jupiterPoints;

        EditText enterName = (EditText) findViewById(R.id.enterName);
        enterName.getText().toString();
        String name = enterName.getText().toString();

        EditText jupiterAnswer = (EditText) findViewById(R.id.answerEarth);
        String userAnswer;
        userAnswer = jupiterAnswer.getText().toString();

        if (userAnswer.equals("Jupiter") || userAnswer.equals("jupiter")){

            jupiterPoints += 1;
        }

        else {
            jupiterPoints = jupiterPoints + 0;
        }


        String summaryScore = createTestSummary(name, score);

        TextView score = (TextView) findViewById(R.id.scoreSummaryTextView);
        score.setText(summaryScore);

        RadioButton radioButton = (RadioButton) findViewById(R.id.radio_true_speed);
        radioButton.setEnabled(false);

        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_true_series);
        radioButton1.setEnabled(false);

        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_false_speed);
        radioButton2.setEnabled(false);

        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radio_false_series);
        radioButton3.setEnabled(false);

        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radio_true_moses);
        radioButton4.setEnabled(false);

        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radio_false_moses);
        radioButton5.setEnabled(false);

        RadioButton radioButton6 = (RadioButton) findViewById(R.id.radio_true_age);
        radioButton6.setEnabled(false);

        RadioButton radioButton7 = (RadioButton) findViewById(R.id.radio_false_age);
        radioButton7.setEnabled(false);

        RadioButton radioButton8 = (RadioButton) findViewById(R.id.radio_true_rsvp);
        radioButton8.setEnabled(false);

        RadioButton radioButton9 = (RadioButton) findViewById(R.id.radio_false_rsvp);
        radioButton9.setEnabled(false);

        RadioButton radioButton10 = (RadioButton) findViewById(R.id.radio_true_opposite);
        radioButton10.setEnabled(false);

        RadioButton radioButton11 = (RadioButton) findViewById(R.id.radio_false_opposite);
        radioButton11.setEnabled(false);

        RadioButton radioButton12 = (RadioButton) findViewById(R.id.radio_true_group);
        radioButton12.setEnabled(false);

        RadioButton radioButton13 = (RadioButton) findViewById(R.id.radio_false_group);
        radioButton13.setEnabled(false);

        RadioButton radioButton14 = (RadioButton) findViewById(R.id.radio_true_fork);
        radioButton14.setEnabled(false);

        RadioButton radioButton15 = (RadioButton) findViewById(R.id.radio_false_fork);
        radioButton15.setEnabled(false);


    }

    public void reset(View view){

        score = 0;
        rsvpPoints = 0;
        mosesPoints = 0;
        seriesPoints = 0;
        speedPoints = 0;
        oppositePoints = 0;
        agePoints = 0;
        groupPoints = 0;
        forkPoints = 0;
        jupiterPoints = 0;


        TextView summaryView = (TextView) findViewById(R.id.scoreSummaryTextView);
        summaryView.setText(" ");

        EditText name = (EditText)findViewById(R.id.enterName);
        name.setText(null);
        EditText answer = (EditText)findViewById(R.id.answerEarth);
        answer.setText(null);

        RadioButton radioButton = (RadioButton) findViewById(R.id.radio_true_speed);
        radioButton.setEnabled(true);

        RadioButton radioButton1 = (RadioButton) findViewById(R.id.radio_true_series);
        radioButton1.setEnabled(true);

        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radio_false_speed);
        radioButton2.setEnabled(true);

        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radio_false_series);
        radioButton3.setEnabled(true);

        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radio_true_moses);
        radioButton4.setEnabled(true);

        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radio_false_moses);
        radioButton5.setEnabled(true);

        RadioButton radioButton6 = (RadioButton) findViewById(R.id.radio_true_age);
        radioButton6.setEnabled(true);

        RadioButton radioButton7 = (RadioButton) findViewById(R.id.radio_false_age);
        radioButton7.setEnabled(true);

        RadioButton radioButton8 = (RadioButton) findViewById(R.id.radio_true_rsvp);
        radioButton8.setEnabled(true);

        RadioButton radioButton9 = (RadioButton) findViewById(R.id.radio_false_rsvp);
        radioButton9.setEnabled(true);

        RadioButton radioButton10 = (RadioButton) findViewById(R.id.radio_true_opposite);
        radioButton10.setEnabled(true);

        RadioButton radioButton11 = (RadioButton) findViewById(R.id.radio_false_opposite);
        radioButton11.setEnabled(true);

        RadioButton radioButton12 = (RadioButton) findViewById(R.id.radio_true_group);
        radioButton12.setEnabled(true);

        RadioButton radioButton13 = (RadioButton) findViewById(R.id.radio_false_group);
        radioButton13.setEnabled(true);

        RadioButton radioButton14 = (RadioButton) findViewById(R.id.radio_true_fork);
        radioButton14.setEnabled(true);

        RadioButton radioButton15 = (RadioButton) findViewById(R.id.radio_false_fork);
        radioButton15.setEnabled(true);

        CheckBox chk1 = (CheckBox) findViewById(R.id.chkNiger);
        chk1.setChecked(false);

        CheckBox chk2 = (CheckBox) findViewById(R.id.chkNile);
        chk2.setChecked(false);

        CheckBox chk3 = (CheckBox) findViewById(R.id.chkOrange);
        chk3.setChecked(false);

        CheckBox chk4 = (CheckBox) findViewById(R.id.chkSepik);
        chk4.setChecked(false);


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

        finish();

    }

    public String createTestSummary( String name, int score )
    {

        String summaryScore = "Name: "+ name + "\nTotal Score: " + score + " out of 12 ";
        return summaryScore;
    }

}

