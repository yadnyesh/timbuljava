package io.yadnyesh;

/**
 * Created by z063407 on 5/15/17.
 */
public class ReportCard {
    private int mathScore;

    public ReportCard(int mathScore) {
        this.mathScore = mathScore;
    }

    public ReportCard() {
        this.mathScore = (int) (Math.random()*101) + 1;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}
