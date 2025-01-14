package Easy;

import java.util.ArrayList;
import java.util.List;

public class generatePascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        int i = 2;
        while (i <= numRows) {
            List<Integer> preRow = row;
            row = new ArrayList<>();
            row.add(1);
            for (int j = 2; j < i; j++) {
                row.add(preRow.get(j-2) + preRow.get(j - 1));
            }
            row.add(1);
            result.add(row);
            i++;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
