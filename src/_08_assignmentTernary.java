//Write a program that takes two numbers as input and prints the larger number using the ternary operator.

import java.util.Scanner;

public class _08_assignmentTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your final marks to check if you passed or not : ");

        int inputMark = sc.nextInt();

        String ternary = (inputMark > 32)  ? "Passed" : "Failed";

        System.out.println(ternary);


    }
}
