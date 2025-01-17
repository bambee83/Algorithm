import java.io.*;
import java.util.*;

public class Main {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) {
            int M = Integer.parseInt(br.readLine()); // 수열의 크기 (홀수)
            int numOfMedians = (M + 1) / 2; // 중앙값의 개수
            sb.append(numOfMedians).append("\n");

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최대 힙
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // 최소 힙
            List<Integer> medians = new ArrayList<>();

            int count = 0; // 현재 입력된 수의 개수
            for (int i = 0; i < M; i++) {
                // 다음 숫자 읽기
                if (count % 10 == 0) {
                    // 10개씩 나눠서 입력이 주어지므로 한 번에 읽음
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    while (st.hasMoreTokens()) {
                        int x = Integer.parseInt(st.nextToken());
                        count++;

                        // 값 삽입 및 힙 조정
                        if (maxHeap.isEmpty() || x <= maxHeap.peek()) {
                            maxHeap.add(x);
                        } else {
                            minHeap.add(x);
                        }

                        // 힙 균형 조정
                        if (maxHeap.size() > minHeap.size() + 1) {
                            minHeap.add(maxHeap.poll());
                        } else if (minHeap.size() > maxHeap.size()) {
                            maxHeap.add(minHeap.poll());
                        }

                        // 중앙값 추가 (홀수 번째 수일 때)
                        if (count % 2 == 1) {
                            medians.add(maxHeap.peek());
                        }
                    }
                }
            }

            // 중앙값 출력 (10개씩 한 줄)
            for (int i = 0; i < medians.size(); i++) {
                if (i > 0 && i % 10 == 0) {
                    sb.append("\n");
                }
                sb.append(medians.get(i)).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}