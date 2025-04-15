//Write a Java program to create a thread by extending the Thread class. The thread should print numbers from 1 to 10 with a delay of 500 milliseconds between each number.

class DelayedPrinter extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
            i++;
        }
    }
}

public class _28_assignmentThreadExtender {
    public static void main(String[] args) {
        DelayedPrinter print = new DelayedPrinter();
        print.start();
    }
}
