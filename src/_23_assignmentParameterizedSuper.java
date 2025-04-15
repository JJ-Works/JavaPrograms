//Write a Java program where a subclass invokes a parameterized constructor of the superclass using super().
class ThisIsSuper{
    ThisIsSuper(String parameterized){
        System.out.printf("This is invoked form %s class.\n",parameterized);
    }
}
class Invoker1 extends ThisIsSuper {
    Invoker1() {
        super("Invoker1");
    }
}
class Invoker2 extends ThisIsSuper{
    Invoker2(){
        super("Invoker2");
    }
}


public class _23_assignmentParameterizedSuper {
    public static void main(String[] args) {
        Invoker1 in1 = new Invoker1();
        Invoker2 in2 = new Invoker2();

    }
}
