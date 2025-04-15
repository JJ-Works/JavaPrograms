//Write a Java program where Vehicle is a superclass and Car is a subclass. Demonstrate the use of the extends keyword.

class Vehicle19{
    void tyres(){
        System.out.println("I have tyres");
    }
}

class Car56 extends Vehicle19{

    void color(){

        System.out.println("I am red in color");
    }
}

public class _24_ShowExtends {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Car56 car = new Car56();
        car.tyres();


    }
}
