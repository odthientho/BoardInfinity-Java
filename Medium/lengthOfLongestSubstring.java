package Medium;

import Easy.ButtonWithLongestTime_3386;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String str) {
        int n = str.length(), ans = 0;
        Map<Character, Integer> charToNextIndex = new HashMap<>(); // index after current character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (charToNextIndex.containsKey(str.charAt(j))) {
                i = Math.max(charToNextIndex.get(str.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            charToNextIndex.put(str.charAt(j), j + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(new lengthOfLongestSubstring().lengthOfLongestSubstring(str));
    }
}
