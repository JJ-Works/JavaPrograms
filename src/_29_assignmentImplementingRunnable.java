//Implement a Java program where you create a thread by implementing the Runnable interface. The thread should print the first 10 even numbers.

class RunnablePrinter implements Runnable{
    @Override
    public void run() {
        int i = 2;
        while (i <= 20) {
            System.out.println(i+5);
            i += 2;
        }
    }
}
public class _29_assignmentImplementingRunnable {
    public static void main(String[] args) {
    RunnablePrinter newPrint = new RunnablePrinter();
    Thread thread = new Thread(newPrint);
    thread.start();
    }
}
