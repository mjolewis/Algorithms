package unittests.arrays;

import arrays.FirstDuplicateValue;
import org.junit.jupiter.api.Test;
import arrays.ArrayOfProducts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstDuplicateValueTest {

    @Test
    public void run() {
        int[] array = new int[] {2, 1, 5, 2, 3, 3, 4};
        int actual = FirstDuplicateValue.firstDuplicateValue(array);
        int expected = 2;
        Assertions.assertEquals(expected, actual);

        array = new int[] {2, 1, 5, 3, 3, 2, 4};
        actual = FirstDuplicateValue.firstDuplicateValue(array);
        expected = 3;
        Assertions.assertEquals(expected, actual);

        array = new int[] {1, 1, 2, 3, 3, 2, 2};
        actual = FirstDuplicateValue.firstDuplicateValue(array);
        expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
