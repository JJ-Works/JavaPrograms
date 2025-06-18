public class PrimeCheckUsingSieve {
    public static void main(String[] args) {
        int n = 100;
        long startTime = System.currentTimeMillis();

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\nExecution time: " + (endTime - startTime) + " ms");
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}