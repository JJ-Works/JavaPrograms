//Write a program to override a method in a subclass and use the super keyword to call the superclass method.

class TwoWheeler{
    void type(){
        System.out.println("I am a Bike.");
    }
}

class Cycle extends TwoWheeler{
    @Override
    void type(){
        super.type();
        System.out.println("I have to wheels, but I am a cycle.");
    }
}

public class _21_assignmentOverriding {
    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        cycle.type();
    }
}
