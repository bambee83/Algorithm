import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.add(x);
                    break;

                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.poll() + "\n");
                    }
                    break;

                case "size":
                    sb.append(queue.size() + "\n");
                    break;

                case "empty":
                    sb.append(queue.isEmpty() ? "1\n" : "0\n");
                    break;

                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peek() + "\n");
                    }
                    break;

                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peekLast() + "\n");
                    }
                    break;
            }
        }
        System.out.print(sb);

    }
}