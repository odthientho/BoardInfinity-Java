package Medium;

import java.util.HashMap;
import java.util.Map;

public class longestPalindrome {

    // check if that one is Palindrome
    public boolean check(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public String longestPalindrome(String str) {
        for (int len = str.length(); len > 0; len--) {
            int left = 0;
            int right = left + len -1;
            while (right < str.length()) {
                if (check(str, left, right)) {
                    return str.substring(left, right+1);
                } else {
                    left++;
                    right++;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "babad";
        System.out.println(new longestPalindrome().longestPalindrome(str));
    }
}
