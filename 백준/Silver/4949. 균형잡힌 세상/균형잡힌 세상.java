import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true) {
            line = br.readLine();
            if (line.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);  // 여는 괄호는 스택에 넣는다
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;  // 짝이 맞지 않으면 종료
                    }
                    stack.pop();  // 짝이 맞으면 스택에서 꺼낸다
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;  // 짝이 맞지 않으면 종료
                    }
                    stack.pop();  // 짝이 맞으면 스택에서 꺼낸다
                }
            }

            // 스택이 비어 있으면 균형이 맞고, 아니면 맞지 않음
            if (isBalanced && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}