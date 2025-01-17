import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        // 우선순위 큐 정의 (사용자 정의 Comparator)
        PriorityQueue<Integer> absHeap = new PriorityQueue<>(
                (a, b) -> {
                    int absA = Math.abs(a);
                    int absB = Math.abs(b);
                    if (absA == absB) {
                        // 절댓값이 같다면, 값 기준 오름차순 정렬
                        return Integer.compare(a, b);
                    }
                    // 절댓값 기준 오름차순 정렬
                    return Integer.compare(absA, absB);
                }
        );

        // 연산 처리
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (absHeap.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(absHeap.poll()).append("\n");
                }
            } else {
                absHeap.add(x);
            }
        }
        System.out.print(sb);
    }
}