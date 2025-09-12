package sectionFive.exercise02;

public class SpeedConverter {
  // write code here

  //  toMilesPerHour(1.5); → should return value 1
  //  toMilesPerHour(10.25); → should return value 6
  //  toMilesPerHour(-5.6); → should return value -1
  //  toMilesPerHour(25.42); → should return value 16
  //  toMilesPerHour(75.114); → should return value 47
  public static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      return -1;
    }

    double mph = kilometersPerHour / 1.609;

    if (mph == Math.floor(mph)) {
      return (long) mph;
    } else {
      return Math.round(mph);
    }
  }

  public static void printConversion(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
    } else {
      long milesPerHour = toMilesPerHour(kilometersPerHour);
      System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
  }

  public static void main(String[] args) {
    //    long something1 = toMilesPerHour(1.5);
    //    long something2 = toMilesPerHour(10.25);
    //    long something3 = toMilesPerHour(-5.6);
    //    long something4 = toMilesPerHour(25.42);
    //    long something5 = toMilesPerHour(75.114);
    //    System.out.println(something1);
    //    System.out.println(something2);
    //    System.out.println(something3);
    //    System.out.println(something4);
    //    System.out.println(something5);

    printConversion(1.5);
    printConversion(10.25);
    printConversion(-5.6);
    printConversion(-2.0);
    printConversion(2.0);
    printConversion(25.42);
    printConversion(75.114);
  }
}