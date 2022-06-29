package InitialSteps;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your age.");
        age = input.nextInt();

        if (age > 13)
        {
            System.out.println("Welcome! You are eligible for registration in our site.");
        }
        else
        {
            System.out.println("We are sorry, but you cannot register in our site.");
        }
    }
}
