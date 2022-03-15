package unittests.arrays;

import arrays.ArrayOfProducts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayOfProductsTest {

    @Test
    public void run() {
        int[] array = new int[] {5, 1, 4, 2};
        int[] actual = ArrayOfProducts.arrayOfProducts(array);
        int[] expected = new int[] {8, 40, 10, 20};
        Assertions.assertArrayEquals(expected, actual);

        array = new int[] {1, 8, 6, 2, 4};
        actual = ArrayOfProducts.arrayOfProducts(array);
        expected = new int[] {384, 48, 64, 192, 96};
        Assertions.assertArrayEquals(expected, actual);

        array = new int[] {-5, 2, -4, 14, -6};
        actual = ArrayOfProducts.arrayOfProducts(array);
        expected = new int[] {672, -1680, 840, -240, 560};
        Assertions.assertArrayEquals(expected, actual);
    }
}
