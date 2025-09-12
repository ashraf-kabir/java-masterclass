package sectionFive.exercise03;

public class MegaBytesConverter {

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int remainder = kiloBytes % 1024;
      int mb = kiloBytes / 1024;
      System.out.println(kiloBytes + " KB = " + mb + " MB and " + remainder + " KB");
    }
  }

  public static void main(String[] args) {
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(5000);
  }
}
