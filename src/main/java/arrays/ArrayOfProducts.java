package arrays;

import java.util.Arrays;

public class ArrayOfProducts {
    public static int[] arrayOfProducts(int[] array) {
        int[] products = new int[array.length];

        int leftRunningProducts = 1;
        for (int i = 0; i < array.length; ++i) {
            products[i] = leftRunningProducts;
            leftRunningProducts *= array[i];
        }

        int rightRunningProducts = 1;
        for (int i = array.length - 1; i >= 0; --i) {
            products[i] *= rightRunningProducts;
            rightRunningProducts *= array[i];
        }
        return products;
    }
}
