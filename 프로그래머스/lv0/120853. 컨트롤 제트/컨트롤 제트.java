import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        String[] words = s.split(" ");
        
        for (String word : words) {
            if (word.equals("Z")) {
                int lastNumber = stack.pop();
                answer -= lastNumber;
            } else {
                int number = Integer.parseInt(word);
                stack.push(number);
                answer += number;
            }
        }
        
        return answer;
    }
}
