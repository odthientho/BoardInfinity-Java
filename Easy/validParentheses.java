package Easy;

import java.util.Stack;

public class validParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char popChar = stack.pop();
                    if (ch == ')' && popChar != '(') {
                        return false;
                    } else if (ch == '}' && popChar != '{') {
                        return false;
                    } else if (ch == ']' && popChar != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("({)"));
    }
}
