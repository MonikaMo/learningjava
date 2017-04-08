/**
 * Created by MoniMo on 4/8/17.
 */
public class Hello {
    public static void main(String[] args) {
        int firstScore = calculateScore(true, 800, 5, 100);
        int secondScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your first score is " + firstScore);
        System.out.println("Your second score is " + secondScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Player A",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Player B",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Player C",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Player D",highScorePosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
    public static void displayHighScorePosition (String player, int position){
        System.out.println(player + " managed to get into the position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition (int playerScore){
        if (playerScore>1000)
            return 1;
        else if (playerScore > 500 && playerScore <1000)
            return 2;
        else if (playerScore >100 && playerScore < 500)
            return 3;
        else return 4;
    }


}
