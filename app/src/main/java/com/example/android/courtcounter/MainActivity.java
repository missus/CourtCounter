package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String SCORE_A = "scoreA";
    public static final String SCORE_B = "scoreB";
    public static final String FOUL_A = "foulA";
    public static final String FOUL_B = "foulB";
    public static final String CORNER_A = "cornerA";
    public static final String CORNER_B = "cornerB";
    int scoreA = 0;
    int scoreB = 0;
    int foulA = 0;
    int foulB = 0;
    int cornerA = 0;
    int cornerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayAll();
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayCornerTeamA(int corner) {
        TextView foulView = (TextView) findViewById(R.id.team_a_corner);
        foulView.setText(String.valueOf(corner));
    }

    public void addScoreA(View view) {
        scoreA += 1;
        displayScoreForTeamA(scoreA);
    }

    public void addFoulA(View view) {
        foulA += 1;
        displayFoulTeamA(foulA);
    }

    public void addCornerA(View view) {
        cornerA += 1;
        displayCornerTeamA(cornerA);
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void addScoreB(View view) {
        scoreB += 1;
        displayScoreForTeamB(scoreB);
    }
    public void displayCornerTeamB(int corner) {
        TextView foulView = (TextView) findViewById(R.id.team_b_corner);
        foulView.setText(String.valueOf(corner));
    }

    public void addFoulB(View view) {
        foulB += 1;
        displayFoulTeamB(foulB);
    }

    public void addCornerB(View view) {
        cornerB += 1;
        displayCornerTeamB(cornerB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        foulA = 0;
        foulB = 0;
        cornerA = 0;
        cornerB = 0;
        displayAll();
    }

    public void displayAll() {
        displayScoreForTeamA(scoreA);
        displayScoreForTeamB(scoreB);
        displayFoulTeamA(foulA);
        displayFoulTeamB(foulB);
        displayCornerTeamA(cornerA);
        displayCornerTeamB(cornerB);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_A, scoreA);
        outState.putInt(SCORE_B, scoreB);
        outState.putInt(FOUL_A, foulA);
        outState.putInt(FOUL_B, foulB);
        outState.putInt(CORNER_A, cornerA);
        outState.putInt(CORNER_B, cornerB);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreA = savedInstanceState.getInt(SCORE_A);
        scoreB = savedInstanceState.getInt(SCORE_B);
        foulA = savedInstanceState.getInt(FOUL_A);
        foulB = savedInstanceState.getInt(FOUL_B);
        cornerA = savedInstanceState.getInt(CORNER_A);
        cornerB = savedInstanceState.getInt(CORNER_B);
        displayAll();
    }
}
