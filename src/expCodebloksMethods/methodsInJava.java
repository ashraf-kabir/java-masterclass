package expCodebloksMethods;

public class methodsInJava {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calc(gameOver, score, levelCompleted, bonus);
        calc(true, 10000, 8, 200);

        int highScore = calculate(true, 20000, 8, 200);
        System.out.println("Your final score was " + highScore);



        int highScorePosition = calculatedHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition(900);
        displayHighScorePosition("Max", highScorePosition);

        highScorePosition = calculatedHighScorePosition(400);
        displayHighScorePosition("James", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Robert", highScorePosition);

        highScorePosition = calculatedHighScorePosition(1000);
        displayHighScorePosition("Jose", highScorePosition);

        highScorePosition = calculatedHighScorePosition(500);
        displayHighScorePosition("Carol", highScorePosition);

        highScorePosition = calculatedHighScorePosition(100);
        displayHighScorePosition("Frank", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculatedHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static void calc(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static int calculate(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }
}
