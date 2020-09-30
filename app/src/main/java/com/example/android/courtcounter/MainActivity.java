package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View View) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View View) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View View) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View View) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View View) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View View) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void resetOrder(View View) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}