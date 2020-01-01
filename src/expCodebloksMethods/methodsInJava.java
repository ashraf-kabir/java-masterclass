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
