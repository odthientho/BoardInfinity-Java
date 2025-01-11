package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {

    public static void backtracking(int target, List<Integer> list, int start, int[] candidates, List<List<Integer>> result) {
                if (target == 0) {
                    result.add(new ArrayList<>(list));
                    return;
                } else if (target < 0) {
                    return;
                }
                for (int i = start; i < candidates.length; i++) {
                    list.add(candidates[i]);
                    backtracking(target - candidates[i], list, i, candidates, result);
                    list.remove(list.size() - 1);
                }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtracking(target, list, 0, candidates, res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{3, 2, 6, 7}, 7).toString());
    }
}
