public class Solution {
    public boolean solution(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                stack.pop(); 
            }
        }

        return stack.isEmpty();
    }
}