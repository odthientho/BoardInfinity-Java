package Medium;

import java.util.ArrayList;
import java.util.List;

/*******  Description  ************
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 *  Example 1:
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 *  Example 2:
 * Input: nums = [0]
 * Output: [[],[0]]
 *
 * Constraints:
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * All the numbers of nums are unique.
 *
 * */

public class Subsets_78 {

    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // add a blank list [] into the result list
        res.add(new ArrayList<>());
        // for each unique number in nums
        for (int num : nums) {
            int size = res.size();
            // add to the end of each list of result list: new number
            for (int j = 0; j < size; j++) {
                List<Integer> temp = new ArrayList<>(res.get(j));
                temp.add(num);
                res.add(new ArrayList<>(temp));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // int[] nums = new int[]{1, 2, 3};
        int[] nums = new int[]{ 0 };
        System.out.println(new Subsets_78().solution(nums));
    }
}
