public class IfThenElseChallenge {
    boolean gameOver;
    int score;
    int levelCompleted;

    int bonus;

    int finalScore;

    IfThenElseChallenge(int score, int levelCompleted, int bonus, boolean gameOver) {
        this.score = score;
        this.levelCompleted = levelCompleted;
        this.bonus = bonus;
        this.gameOver = gameOver;
        this.finalScore = this.score;
    }

    public void displayFinalScore() {
        if (gameOver) {
            this.finalScore += levelCompleted * this.bonus;
            this.finalScore += 1000;
            System.out.println("Final-Score = " + this.finalScore);
        }
    }
}
