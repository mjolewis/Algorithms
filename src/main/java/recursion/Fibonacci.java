package recursion;

public class Fibonacci {
    public static int getNthFib(int n) {
        if (n <= 2) return n - 1;
        int prevPrev = 0;
        int prev = 1;
        int next = 0;
        for (int i = 3; i <= n; ++i) {
            next = prevPrev + prev;
            prevPrev = prev;
            prev = next;
        }
        return next;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(Fibonacci.getNthFib(n));

        n = 1;
        System.out.println(Fibonacci.getNthFib(n));

        n = 2;
        System.out.println(Fibonacci.getNthFib(n));

        n = 4;
        System.out.println(Fibonacci.getNthFib(n));
    }
}
