import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        // 우선순위 큐 (최대 힙 구현)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                // 배열에서 가장 큰 값을 출력하고 제거
                if (maxHeap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(maxHeap.poll()).append("\n");
                }
            } else {
                // 배열에 값을 추가
                maxHeap.offer(x);
            }
        }
        System.out.println(sb.toString());
    }
}