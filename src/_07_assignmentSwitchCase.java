//Write a program that takes an integer (1-7) as input and prints the corresponding day of the week using a switch statement.

import java.util.Scanner;

public class _07_assignmentSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value from 1 to 7:  ");



        while (true){
            int a = sc.nextInt();
            switch (a){

                case 1:
                    System.out.println("Sunday");
                    break;
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("\nXXXXX=====>Please choose from 1 to 7<=====XXXXX.");
                    break;
            }
        }
    }
}
