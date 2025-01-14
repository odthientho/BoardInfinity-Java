package Easy;

import java.util.HashMap;
import java.util.Map;

public class findShortestSubArray {

    public static int findShortestSubArray(int[] nums) {
        // num - index
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        Map<Integer, Integer> count = new HashMap<>();
        int min = nums.length;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) count.put(nums[i],count.get(nums[i])+1);
            else count.put(nums[i],1);

            if (first.containsKey(nums[i])) last.put(nums[i], i);
            else  {
                first.put(nums[i], i);
                last.put(nums[i], i);
            }

            if (count.get(nums[i]) > max) {
                min = last.get(nums[i])-first.get(nums[i]) +1;
                max = count.get(nums[i]);
            } else if (count.get(nums[i]) == max) {
                if (min > last.get(nums[i]) - first.get(nums[i])+1) min = last.get(nums[i])-first.get(nums[i])+1;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{2, 1}));
    }
}
