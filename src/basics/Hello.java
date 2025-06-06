package basics;

public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    boolean isViewed = false;
    if (isViewed) {
      System.out.println("Viewed");
    } else {
      System.out.println("Not Viewed");
    }

    if (!isViewed) {
      System.out.println("Not Viewed");
    }

    int topScore = 70;
    if (topScore < 100) {
      System.out.println("Top score: " + topScore);
    }  else {
      System.out.println("Top score: " + topScore);
    }

    int secondTopScore = 100;
    if (secondTopScore < 100 && topScore < 100) {
      System.out.println("Second top score: " + secondTopScore);
    }  else {
      System.out.println("Second top score: " + secondTopScore);
    }

    if (topScore > 15 || secondTopScore > 50) {
      System.out.println("Top score: " + topScore);
    }   else {
      System.out.println("Top score: " + topScore);
    }

    if (secondTopScore == 40) {
      System.out.println("Second top score: " + secondTopScore);
    }

    double firstValue = 45.00;
    double secondValue = 5.00;
    double totalValue = (firstValue + secondValue) * 2d;
    System.out.println("Total value: " + totalValue);

    double theRemainder = totalValue % firstValue;
    System.out.println("Remainder: " + theRemainder);
    boolean isNoRemainder = (theRemainder == 0) ? true : false;
    System.out.println("isNoRemainder: " + isNoRemainder);
  }
}
