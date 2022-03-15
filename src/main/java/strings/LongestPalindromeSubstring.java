package strings;

public class LongestPalindromeSubstring {

    public static String longestPalindromicSubstring(String str) {
        int[] longest = {0, 1};
        for (int i = 0; i < str.length(); ++i) {
            int[] odd = getLongestPalindrome(str, i - 1, i + 1);
            int[] even = getLongestPalindrome(str, i - 1, i);
            int[] currentLongest = odd[1] - odd[0] < even[1] - even[0] ? even : odd;
            longest = currentLongest[1] - currentLongest[0] < longest[1] - longest[0] ? longest : currentLongest;
        }
        return str.substring(longest[0], longest[1]);
    }

    public static int[] getLongestPalindrome(String str, int leftIdx, int rightIdx) {
        while (leftIdx >= 0 && rightIdx < str.length()) {
            if (str.charAt(leftIdx) != str.charAt(rightIdx)) {
                break;
            }
            --leftIdx;
            ++rightIdx;
        }
        return new int[] {++leftIdx, rightIdx};
    }
}
