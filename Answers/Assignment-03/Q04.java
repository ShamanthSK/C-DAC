// Assignment 03 - Question 04: Prime Numbers
public class Q04 {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static void findPrimesUpTo(int n) {
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int limit = 30;
        findPrimesUpTo(limit);
    }
}