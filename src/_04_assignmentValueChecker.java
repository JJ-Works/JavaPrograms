//Write a program that takes a number as input and checks whether it is positive, negative, or zero using if-else.
package work.classwork;
import java.util.Scanner;


public class _04_assignmentValueChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if the provided num is positive, negative, or zero: ");

        int i = 0;
        while(i < 3){
        int input = sc.nextInt();
            if(input < 0){
                System.out.println("negative.");
            }
            else if(input>0){
                System.out.println("positive");
            }
            else{
                System.out.println("Zero");
            }
            i++;
        }
    }
}
