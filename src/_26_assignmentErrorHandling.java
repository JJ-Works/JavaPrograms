//Write a program that takes two integers as input and performs division. Handle the case where the denominator is zero using a try-catch block.

import java.util.Scanner;

public class _26_assignmentErrorHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        try{
            double div = (double) input1 /input2;
            System.out.println(div);
        }
        catch (Exception e){
            System.out.println("This is the exception.");

        }

    }
}
