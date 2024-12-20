import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            queue.poll(); // 첫 번째 카드를 버림
            queue.add(queue.poll()); // 그다음 카드를 맨 뒤로 이동
        }
        System.out.println(queue.peek());
        }
    }