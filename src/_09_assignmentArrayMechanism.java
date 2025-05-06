//Write a program that declares an array of five integers, assigns values, and prints all elements.

import java.util.Scanner;

public class _09_assignmentArrayMechanism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int input;
        int[] array = new int[5];

        for (i = 0; i< 5; i ++){
            System.out.printf("Index [%d]:  ",i+1);
            input = sc.nextInt();
            array[i] = input;

        }
        for (i = 0; i<5;i++){
            System.out.printf("Array [%d] = %d\n",(i+1),array[i]);
        }
    }
}
