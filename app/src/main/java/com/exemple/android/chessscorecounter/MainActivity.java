package com.exemple.android.chessscorecounter;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.exemple.android.chessscorecounter.R;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team A
    int scoreWhite = 0;
    // Tracks the score for Team B
    int scoreBlack = 0;
    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int scoreWhite) {
        TextView scoreView = (TextView) findViewById(R.id.white_score);
        scoreView.setText(String.valueOf(scoreWhite));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreBlack) {
        TextView scoreView = (TextView) findViewById(R.id.black_score);
        scoreView.setText(String.valueOf(scoreBlack));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayForTeamA() {
    }

    public void scoreBlackPawnForTeamWhite(View v){
        scoreWhite = scoreWhite +1;
        displayForTeamA (scoreWhite);
    }
    public void scoreBlackRookForTeamWhite(View v){
        scoreWhite = scoreWhite +5;
        displayForTeamA (scoreWhite);
    }
    public void scoreBlackKnightForTeamWhite(View v){
        scoreWhite = scoreWhite +3;
        displayForTeamA (scoreWhite);
    }
    public void scoreBlackBishopForTeamWhite(View v){
        scoreWhite = scoreWhite +3;
        displayForTeamA (scoreWhite);
    }
    public void scoreBlackQueenForTeamWhite(View v){
        scoreWhite = scoreWhite +9;
        displayForTeamA (scoreWhite);
    }
    public void scoreBlackKingForTeamWhite(View v){
        scoreWhite = scoreWhite +4;
        displayForTeamA (scoreWhite);
    }


    private void displayForTeamB() {
    }

    public void scoreWhitePawnForTeamBlack(View v){
        scoreBlack = scoreBlack +1;
        displayForTeamB (scoreBlack);
    }
    public void scoreWhiteRookForTeamBlack(View v){
        scoreBlack = scoreBlack +5;
        displayForTeamB (scoreBlack);
    }
    public void scoreWhiteKnightForTeamBlack(View v){
        scoreBlack = scoreBlack +3;
        displayForTeamB (scoreBlack);
    }
    public void scoreWhiteBishopForTeamBlack(View v){
        scoreBlack = scoreBlack +3;
        displayForTeamB (scoreBlack);
    }
    public void scoreWhiteQueenForTeamBlack(View v){
        scoreBlack = scoreBlack +9;
        displayForTeamB (scoreBlack);
    }
    public void scoreWhiteKingForTeamBlack(View v){
        scoreBlack = scoreBlack +4;
        displayForTeamB (scoreBlack);
    }

    /**
     * This button resets & displays the reset scores for Teams A & B.
     */


    public void resetScoreTeamA (View v) {
        scoreWhite = 0;
        displayForTeamA(scoreWhite);

    }
    public void resetScoreTeamB (View v) {
        scoreBlack = 0;
        displayForTeamB(scoreBlack);

    }

}