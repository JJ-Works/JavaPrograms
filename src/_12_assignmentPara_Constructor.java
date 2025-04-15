// Create a Java class named Laptop with attributes brand (String), ram (int), and price (double). Implement a parameterized constructor to initialize these attributes

import java.util.logging.Level;

class Laptop{

    String brand;
    int ram;
    double price;


    Laptop(String b, double p, int r){

        // Instead of using this keyword i have used a different parameters
        brand = b;
        ram = r;
        price = p;

    }

    // To display the set values we have to create a function or method to display the attributes
     void displayInfo(){

        System.out.println("The brand of the Laptop is " + brand + ".");
        System.out.println("The ram of the Laptop is " + ram + "Gb with 4800 Mega transfers.");
        System.out.println("The price of the Laptop is Rs."+ price + " only.");


    }

}

public class _12_assignmentPara_Constructor {
    public static void main(String[] args) {

        System.out.println("Program to parameterized constructor.");

        Laptop lenovo = new Laptop("Asus", 100000, 16);


        lenovo.displayInfo();
    }
}
