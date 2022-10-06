package com.example.bball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
    /**
     * Displays the given score for Team A.
     */
            int scoreTeamA = 0;

    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void threePoints (View a) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPoints (View a) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);

    }
    public void freeThrow (View a) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);

    }
    /**
     * Displays the given score for Team B.
     */

    int scoreTeamB = 0;

    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void threePointsB (View b) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointsB (View b) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);

    }
    public void freeThrowB (View b) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);

    }

    public void resetScore (View v){
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
}
