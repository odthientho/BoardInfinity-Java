package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Parser {

    static String isBalanced(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            if (c == '(' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == '}') {
                if (stack.isEmpty()) {
                    return "false";
                }
                else {
                    char p = stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        String s = "{}())";
        System.out.println(isBalanced(s));
    }
}
