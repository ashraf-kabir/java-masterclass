package sectionFive;

public class MethodChallenge {

  public static void main(String[] args) {
    int highScorePosition1 = calculateHighScorePosition(1500);
    displayHighScorePosition("Max", highScorePosition1);
    int highScorePosition2 = calculateHighScorePosition(900);
    displayHighScorePosition("Jack", highScorePosition2);
    int highScorePosition3 = calculateHighScorePosition(400);
    displayHighScorePosition("Bob", highScorePosition3);
    int highScorePosition4 = calculateHighScorePosition(50);
    displayHighScorePosition("Fin", highScorePosition4);
  }

  public static void displayHighScorePosition(String playerName, int highScorePosition) {
    System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score list");
  }

  public static int calculateHighScorePosition(int playerScore) {
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
}
