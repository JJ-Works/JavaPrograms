//Write a program that takes a float input from the user, converts it into an integer, and prints both values.
package work.classwork;
import java.util.Scanner;

public class _02_assignmentDatatypeConversion {
    public static void main(String[] args) {
        System.out.println("Enter  floating Value:  ");
        Scanner sc =  new Scanner(System.in);

        float input = sc.nextFloat();
        int inputConverter = (int) input;

        System.out.printf("converted float %f to integer %d.",input,inputConverter);
        sc.close();
    }
}
