abstract class vehicle{
    abstract void start();
}
class car extends vehicle{
    @Override
    void start() {
        System.out.println("Car is starting......... Vroommm....");
    }
}

class bike extends vehicle{
    @Override
    void start(){
        System.out.println("Bike is starting........ Dhoommmm....");
    }
}

public class _19_assignmentAbstract {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        bike b = new bike();
        b.start();

    }
}