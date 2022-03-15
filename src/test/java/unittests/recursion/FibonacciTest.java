package unittests.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import recursion.Fibonacci;

public class FibonacciTest {

    @Test
    public void run() {

        int n = 6;
        int actual = Fibonacci.getNthFib(n);
        int expected = 5;
        Assertions.assertEquals(expected, actual);

        n = 1;
        actual = Fibonacci.getNthFib(n);
        expected = 0;
        Assertions.assertEquals(expected, actual);

        n = 2;
        actual = Fibonacci.getNthFib(n);
        expected = 1;
        Assertions.assertEquals(expected, actual);

        n = 4;
        actual = Fibonacci.getNthFib(n);
        expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
