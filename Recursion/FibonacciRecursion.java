package Recursion;

class FibonacciRecursion {
    // Recursive function to return nth Fibonacci number
    static int fib(int n) {
        if (n <= 1) {
            return n;  // Base case: fib(0) = 0, fib(1) = 1
        }
        return fib(n - 1) + fib(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        int n = 10;  // Example: find 10th Fibonacci number
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
}
