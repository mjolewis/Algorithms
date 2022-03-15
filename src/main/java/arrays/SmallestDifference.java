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
}