package arrays;

import java.util.Arrays;

public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;
        int globalMin = Integer.MAX_VALUE;
        int localMin = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];

        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length) {
            int numOne = arrayOne[idxOne];
            int numTwo = arrayTwo[idxTwo];

            if (numOne > numTwo) {
                localMin = numOne - numTwo;
                ++idxTwo;
            } else if (numOne < numTwo) {
                localMin = numTwo - numOne;
                ++idxOne;
            } else {
                return new int[] {numOne, numTwo};
            }

            if (localMin < globalMin) {
                globalMin = localMin;
                smallestPair = new int[] {numOne, numTwo};
            }
        }
        return smallestPair;
    }

    public static void main(String[] args) {
        int[] arrayOne = new int[] {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = new int[] {26, 134, 135, 15, 17};
        System.out.println(Arrays.toString(SmallestDifference.smallestDifference(arrayOne, arrayTwo)));

        arrayOne = new int[] {10, 0, 20, 25};
        arrayTwo = new int[] {1005, 1006, 1014, 1032, 1031};
        System.out.println(Arrays.toString(SmallestDifference.smallestDifference(arrayOne, arrayTwo)));
    }
}