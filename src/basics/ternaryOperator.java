package basics;

public class ternaryOperator {
  public static void main(String[] args) {

    boolean isCar = false;
    if (isCar) {
      System.out.println("This is not supposed to happen");
    }

    isCar = true;
    boolean wasCar = isCar ? true : false;
    if (wasCar) {
      System.out.println("wasCar is true");
    }

    int ageOfClient = 20;
    boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
    if (isEighteenOrOver) {
      System.out.println("true");
    }
  }
}
