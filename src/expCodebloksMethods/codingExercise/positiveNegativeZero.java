package expCodebloksMethods.codingExercise;

public class positiveNegativeZero {

    public static void checkNumber(int num) {
        if (num > 0) {
            System.out.println("positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-2);
        checkNumber(0);
    }

}
