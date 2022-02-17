package arrays;

import java.util.Arrays;
import java.util.List;

public class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int leftIdx = 0;
        int rightIdx = array.size() - 1;

        while (leftIdx < rightIdx) {
            while (leftIdx < rightIdx && array.get(rightIdx) == toMove) {
                --rightIdx;
            }

            if (array.get(leftIdx) == toMove) {
                swap(array, leftIdx, rightIdx, toMove);
            } else {
                ++leftIdx;
            }
        }
        return array;
    }

    public static void swap(List<Integer> array, int leftIdx, int rightIdx, int toMove) {
        int temp = array.get(rightIdx);
        array.set(rightIdx, toMove);
        array.set(leftIdx, temp);
    }

    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2);
        int toMove = 2;
        System.out.println(MoveElementToEnd.moveElementToEnd(array, toMove).toString());

        array = Arrays.asList(1, 2, 4, 5, 6);
        toMove = 3;
        System.out.println(MoveElementToEnd.moveElementToEnd(array, toMove).toString());
    }
}
