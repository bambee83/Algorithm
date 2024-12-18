import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            String command = br.readLine();
            String[] parts = command.split(" ");
            if (parts[0].equals("1")) {
                int x = Integer.parseInt(parts[1]);
                stack.push(x);
            } else if (parts[0].equals("2")) {
                if (stack.isEmpty()) {
                    result.append("-1\n");
                } else {
                    result.append(stack.pop()).append("\n");
                }
            } else if (parts[0].equals("3")) {
                result.append(stack.size()).append("\n");
            } else if (parts[0].equals("4")) {
                if (stack.isEmpty()) {
                    result.append("1\n");
                } else {
                    result.append("0\n");
                }
            } else if (parts[0].equals("5")) {
                if (stack.isEmpty()) {
                    result.append("-1\n");
                } else {
                    result.append(stack.peek()).append("\n");
                }
            }
        }
        System.out.print(result.toString());
    }
}