import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine(); // 한 줄의 괄호 문자열 입력
            if (isVPS(s)) {
                sb.append("YES\n"); // 올바른 괄호 문자열이면 YES
            } else {
                sb.append("NO\n"); // 아니면 NO
            }
        }
        System.out.print(sb.toString());
    }
    
        public static boolean isVPS(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c); // '('는 스택에 넣음
                } else { // c == ')'
                    if (stack.isEmpty()) {
                        return false; // 닫는 괄호가 더 많으면 NO
                    }
                    stack.pop(); // 스택에서 '('를 제거
                }
            }

            return stack.isEmpty(); // 스택이 비어 있으면 VPS
        }
    }