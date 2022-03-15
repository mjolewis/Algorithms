package unittests.arrays;

import arrays.MoveElementToEnd;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MoveElementToEndTest {

    @Test
    public void run() {
        List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        int toMove = 2;
        List<Integer> actual = MoveElementToEnd.moveElementToEnd(array, toMove);
        List<Integer> expected = Arrays.asList(4, 1, 3, 2, 2, 2, 2, 2);
        Assertions.assertEquals(expected, actual);

        array = Arrays.asList(1, 2, 4, 5, 6);
        toMove = 3;
        actual = MoveElementToEnd.moveElementToEnd(array, toMove);
        expected = Arrays.asList(1, 2, 4, 5, 6);
        Assertions.assertEquals(expected, actual);
    }
}
