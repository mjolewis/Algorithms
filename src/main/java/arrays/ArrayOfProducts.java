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

    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 4, 2};
        System.out.println(Arrays.toString(ArrayOfProducts.arrayOfProducts(array)));

        array = new int[] {1, 8, 6, 2, 4};
        System.out.println(Arrays.toString(ArrayOfProducts.arrayOfProducts(array)));

        array = new int[] {-5, 2, -4, 14, -6};
        System.out.println(Arrays.toString(ArrayOfProducts.arrayOfProducts(array)));
    }
}
