package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*******  Description  ************
 * Given an array nums of distinct integers, return all the possible
 * permutations. You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * Example 2:
 *
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * Example 3:
 *
 * Input: nums = [1]
 * Output: [[1]]
 *
 *  Constraints:
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * All the integers of nums are unique.
 *
 * */
public class Permute_46 {

    private static void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        // Base case: if the current permutation is complete
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Recursive case: try each number in the array
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;  // Skip used elements

            // Choose the current element
            current.add(nums[i]);
            used[i] = true;

            // Recurse with the updated state
            backtrack(nums, current, used, result);

            // Undo the choice (backtrack)
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();  // To store all permutations
        List<Integer> current = new ArrayList<>();       // To build each permutation
        boolean[] used = new boolean[nums.length];       // To track used elements
        backtrack(nums, current, used, result);
        return result;
    }

    public int splitIntoTwo(List<Integer> arr) {
        int n = arr.size();
        int left = arr.get(0);
        int i =1;
        int right =0;
        while (i<n) {
            right += arr.get(i);
            i++;
        }
        i = 1;
        int count =0;
        while (i<n) {
            if (left > right) count++;
            left += arr.get(i);
            right -= arr.get(i);
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3};
//        System.out.println(new Permute_46().solution(nums));
//
        List<Integer> list = new ArrayList<>(Arrays.asList(-3, -2, 10, 20, -30));
        System.out.println(new Permute_46().splitIntoTwo(list));
    }
}
