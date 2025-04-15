//Create a Java program where a subclass calls the superclass constructor using the super keyword.
class Cat{
    void Meows(){
        System.out.println("Meow! Meow!");
    }
}

class Kitten extends Cat{
    void Learns(){
        super.Meows();
        System.out.println("Eating....");
    }
}

public class _20_assignmentSuperClass {
    public static void main(String[] args) {
        Kitten kitten = new Kitten();
        kitten.Learns();
    }
}
