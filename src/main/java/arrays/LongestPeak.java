package arrays;

public class LongestPeak {
    public static int longestPeak(int[] array) {
        if (array.length < 3) return 0;
        int longestPeak = 0;
        int i = 1;
        while (i < array.length - 1) {
            boolean isPeak = array[i - 1] < array[i] && array[i + 1] < array[i];
            if (!isPeak) {
                ++i;
                continue;
            }

            int leftIdx = i - 2;
            while (leftIdx >= 0 && array[leftIdx] < array[leftIdx + 1]) {
                --leftIdx;
            }

            int rightIdx = i + 2;
            while (rightIdx < array.length && array[rightIdx] < array[rightIdx - 1]) {
                ++rightIdx;
            }

            int currentPeak = rightIdx - leftIdx - 1;
            longestPeak = Math.max(currentPeak, longestPeak);

            i = rightIdx;
        }
        return longestPeak;
    }

    public static void main(String[] args) {
        System.out.println(LongestPeak.longestPeak(new int[] {1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3}));
        System.out.println(LongestPeak.longestPeak(new int[] {1, 3, 2}));
        System.out.println(LongestPeak.longestPeak(new int[] {}));
    }
}
