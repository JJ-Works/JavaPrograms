//Write a simple Java class Person with attributes name and age. Add a method displayInfo() that prints the person's details. Create an instance of Person and call the method.
//Create a class Calculator that demonstrates method overloading by defining multiple versions of the add() method to handle different numbers of parameters (e.g., two integers, three integers, and two doubles).
//Define an abstract class Vehicle with an abstract method start(). Create two subclasses (Car and Bike) that provide their own implementations of start().
//Write a Java program that calculates the gcd of a number using recursion.
//Create a Java class Student with attributes name and rollNumber. Implement both a default constructor (that initializes name as "Unknown" and rollNumber as 0) and a parameterized constructor (that initializes them with given values). Add a method displayInfo() to print student details.
class Person2{
    public void displayInfo1(){
        System.out.println("He is Cat.");
    }
}

class addition{
    public void add(int a,int b){
        System.out.println("sum of two "+(a+b));
    }
}

class overloadedAddition extends addition{

    public void add(int a, int b, int c){
        System.out.println("sum of three is "+(a+b+c));

    }

    public void add(int a, int b, int c,int d){
        System.out.println("sum of four "+(a+b+c+d));
    }
}


public class _18_assignmentMethodOverloading {
    public static void main(String[] args) {
        Person2 ppl = new Person2();
        ppl.displayInfo1();

        overloadedAddition adder = new overloadedAddition();
        adder.add(1,2,3,4);
        adder.add(1,2,3);
        adder.add(1,2);
    }
}