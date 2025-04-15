package work.classwork;
import java.util.Scanner;

public class _03_assignmentArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two Values:- ");

        int myInput1 =  sc.nextInt();
        int myInput2 = sc.nextInt()
                ;

        int sum = myInput1+ myInput2;
        int multiplication = myInput1 * myInput2;
        float divison = (float) myInput1 / myInput2;  //this is it
        int subtraction = myInput1 / myInput2;

        System.out.printf("Sum is %d \nDifference is %d\nMutiplication is %d\nDivison is %f\n",sum,subtraction,multiplication,divison);
    }
}