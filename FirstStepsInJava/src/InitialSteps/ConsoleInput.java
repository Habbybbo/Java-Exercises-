package InitialSteps;

import java.util.Scanner;

public class ConsoleInput {
    public static void main (String [] args){
        int assignment_total = 40;
        int exam_total = 200;
        int assignment_grade;
        int exam_grade;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your total assignment grade:");
        assignment_grade = input.nextInt();

        System.out.println("Please enter your final exam grade");
        exam_grade = input.nextInt();

        int student_grade = assignment_grade + exam_grade;
        int total = assignment_total + exam_total;
        float percentage = (float)student_grade/total * 100;

        System.out.println("Your total grade is: " + student_grade);
        System.out.println("Your percentage is: " + percentage);
    }
}
