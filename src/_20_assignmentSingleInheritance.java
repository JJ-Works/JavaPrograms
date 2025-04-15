class Vehicle {
    void Wheels() {
        System.out.println("I have 4 wheels.");
    }
}

class Car11 extends Vehicle {
    void Size() {
        Wheels();
        System.out.println("I am a SuperCar.");
    }
}

public class _20_assignmentSingleInheritance {
    public static void main(String[] args) {
        Car11 car = new Car11();
        car.Size();
    }
}