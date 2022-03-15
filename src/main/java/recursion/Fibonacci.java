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
}
