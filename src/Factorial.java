class Fac {
    public int factorial(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public int sumOfN(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x + sumOfN(x - 1);
        }
    }

    public int fibonacci(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}

public class Factorial {
    public static void main(String[] args) {
        Fac findFac = new Fac();
        int factorials = findFac.factorial(3);
        int summer = findFac.sumOfN(3);
        int fibonaccis = findFac.fibonacci(10);
        System.out.println("Factorial of given number is " + factorials);
        System.out.println("Sum of N number using recursion is " + summer);
        for(int i = 0; i<10; i++){
            System.out.print(findFac.fibonacci(i)+" ");
        }

    }
    }