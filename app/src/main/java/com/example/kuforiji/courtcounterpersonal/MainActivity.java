package com.example.kuforiji.courtcounterpersonal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int ChicagoBullsScore = 0;
    int BostonCelticsScore = 0;
    int resetChicagoBullsScore = 0;
    int chicagoBullsFoul = 0;
    int bostonCelticsFoul = 0;
    int resetBostonCelticsScore = 0;
    int resetBostonCeticsfoul = 0;
    int resetChicagoBullsfoul = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Displays the given score for Chicago Bulls.
     */
    public void displayForChicagoBulls(int score) {
        TextView scoreView = findViewById(R.id.team_chicago_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when lauri 3+ button is clicked
     */
    public void lauri3ptButton(View view) {

        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 3;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when lauri 2+ button is clicked
     */
    public void lauri2ptButton(View view) {

        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 2;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when lauri 1+ button is clicked
     */
    public void lauri1ptButton(View view) {

        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 1;
        displayForChicagoBulls(ChicagoBullsScore);
    }


    /**
     * This method is called when bobby 3+ button is clicked
     */
    public void bobby3ptButton(View view) {

        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 3;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when bobby 2+ button is clicked
     */
    public void bobby2ptButton(View view) {

        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 2;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when bobby 1+ button is clicked
     */
    public void bobby1ptButton(View view) {

        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 1;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when zack 3+ button is clicked
     */
    public void zack3ptButton(View view) {

        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 3;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when zack 2+ button is clicked
     */

    public void zack2ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 2;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when zack 1+ button is clicked
     */

    public void zack1ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 1;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when chris 3+ button is clicked
     */
    public void chris3ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 3;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when chris 2+ button is clicked
     */
    public void chris2ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 2;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when chris 1+ button is clicked
     */
    public void chris1ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 1;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when robin 3+ button is clicked
     */
    public void robin3ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 3;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when robin 2+ button is clicked
     */
    public void robin2ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 2;
        displayForChicagoBulls(ChicagoBullsScore);
    }

    /**
     * This method is called when robin 1+ button is clicked
     */
    public void robin1ptButton(View view) {
        displayForChicagoBulls(ChicagoBullsScore);
        ChicagoBullsScore = ChicagoBullsScore + 1;
        displayForChicagoBulls(ChicagoBullsScore);
    }


    /**
     * Displays the given score for Boston Celtics.
     */
    public void displayForBostonCeltics(int score) {
        TextView scoreView = findViewById(R.id.team_boston_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when daniel 3+ button is clicked
     */
    public void daniel3ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 3;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when daniel 2+ button is clicked
     */
    public void daniel2ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 2;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when daniel 1+ button is clicked
     */
    public void daniel1ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 1;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when gibson 3+ button is clicked
     */
    public void gibson3ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 3;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when gibson 2+ button is clicked
     */
    public void gibson2ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 2;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when gibson 1+ button is clicked
     */
    public void gibson1ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 1;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when greg 3+ button is clicked
     */
    public void greg3ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 3;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when greg 2+ button is clicked
     */
    public void greg2ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 2;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when greg 1+ button is clicked
     */
    public void greg1ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 1;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when aron 3+ button is clicked
     */
    public void aron3ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 3;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when aron 2+ button is clicked
     */
    public void aron2ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 2;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when aron 1+ button is clicked
     */
    public void aron1ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 1;
        displayForBostonCeltics(BostonCelticsScore);
    }


    /**
     * This method is called when jaylen 3+ button is clicked
     */
    public void jaylen3ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 3;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when jaylen 2+ button is clicked
     */
    public void jaylen2ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 2;
        displayForBostonCeltics(BostonCelticsScore);
    }

    /**
     * This method is called when jaylen 1+ button is clicked
     */
    public void jaylen1ptButton(View view) {
        displayForBostonCeltics(BostonCelticsScore);
        BostonCelticsScore = BostonCelticsScore + 1;
        displayForBostonCeltics(BostonCelticsScore);
    }


    /**
     * This method is called when the reset button is clicked
     */

    public void ResetButton(View view) {
        displayForBostonCeltics(resetBostonCelticsScore);
        displayForChicagoBulls(resetChicagoBullsScore);
        displayForBostonCelticsfoul(resetBostonCeticsfoul);
        displayForChicagoBullsfoul(resetChicagoBullsfoul);
    }

    /**
     * This method displays the chicagoBulls foul value
     */
    public void displayForChicagoBullsfoul(int score) {
        TextView scoreView = findViewById(R.id.chicago_bull_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method displays the bostonCeltics foul value
     */
    public void displayForBostonCelticsfoul(int score) {
        TextView scoreView = findViewById(R.id.boston_celtics_foul);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when the chicagobulls foul button is called
     */
    public void chicagoFoulButton(View view) {
        displayForChicagoBullsfoul(chicagoBullsFoul);
        chicagoBullsFoul = chicagoBullsFoul + 1;
        displayForChicagoBullsfoul(chicagoBullsFoul);
    }

    /**
     * This method is called when the bostonCeltics foul button is called
     */
    public void bostonFoulButton(View view) {
        displayForBostonCelticsfoul(bostonCelticsFoul);
        bostonCelticsFoul = bostonCelticsFoul + 1;
        displayForBostonCelticsfoul(bostonCelticsFoul);
    }


}
