//Write a program that prints the sum of all numbers from 1 to N, where N is input by the user, using a while loop.
package work.classwork;
import java.util.Scanner;

public class _06_assignmentSumTillUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to add up to: ");
        int sum = 0;
        int input = sc.nextInt();

        for(int i = 1; i<=input;i++){
         sum += i;
        }
        System.out.println(sum);
    }
}
