package controlflow;

import java.util.Scanner;

public class testInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year of birth: ");

        boolean hasNextInt = sc.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter your name");
            String name = sc.nextLine();
            int age = 2018 - yearOfBirth;

            if (age >= 0 && age <=100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("unable to parse your birth");
        }

        sc.close();

    }
}
