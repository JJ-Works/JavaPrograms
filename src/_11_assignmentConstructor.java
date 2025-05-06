//1. Write a Java class named Person with attributes name (String) and age (int). Include a default constructor that initializes name to "Unknown" and age to 0.

class Person{
    String name;
    int age;

    Person(){

        name = "Unknown";
        age = 0;
    }
}


public class _11_assignmentConstructor {

    public static void main(String[] args) {
        System.out.println("Program to use the use of an constructor");

        Person initial = new Person();

        System.out.println(initial.name);
        System.out.println(initial.age);
    }
}
