package sectionFive.exercise05;

public class LeapYear {
  public static boolean isLeapYear(int year) {
    if (year >= 1 && year <= 9999) {
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            return true;
          } else {
            return false;
          }
        } else {
          return true;
        }
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    boolean test1 = isLeapYear(-1600);
    boolean test2 = isLeapYear(1600);
    boolean test3 = isLeapYear(2015);
    boolean test4 = isLeapYear(2000);
    boolean test5 = isLeapYear(1924);

    System.out.println(test1);
    System.out.println(test2);
    System.out.println(test3);
    System.out.println(test4);
    System.out.println(test5);
  }
}
