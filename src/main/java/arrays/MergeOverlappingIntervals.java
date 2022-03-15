package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {

        // Sort the intervals by starting value
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));

        // A List lets us dynamically store the merged intervals during the algorithm.
        // This gets converted to a fixed size array at the end to accomodate the return type
        List<int[]> mergedIntervals = new ArrayList<>();
        int[] currentInterval = sortedIntervals[0];
        mergedIntervals.add(currentInterval);

        for (int[] nextInterval : sortedIntervals) {
            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart = nextInterval[0];
            int nextIntervalEnd = nextInterval[1];

            if (currentIntervalEnd >= nextIntervalStart) {
                // The input array has been sorted, so find the max element between the
                // current interval and end interval to use as the end value of the interval
                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
            } else {
                currentInterval = nextInterval;
                mergedIntervals.add(currentInterval);
            }
        }
        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }
}
