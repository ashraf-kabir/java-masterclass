package sectionFive.exercise04;

public class BarkingDog {
  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (hourOfDay < 0 || hourOfDay > 23) {
      return false;
    }

    if (barking) {
      return hourOfDay < 8 || hourOfDay > 22;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    boolean test1 = shouldWakeUp(true, 1);
    boolean test2 = shouldWakeUp(false, 2);
    boolean test3 = shouldWakeUp(true, 8);
    boolean test4 = shouldWakeUp(true, -1);

    System.out.println(test1);
    System.out.println(test2);
    System.out.println(test3);
    System.out.println(test4);
  }
}
