import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 처리
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        // 덱 초기화: (번호, 값) 쌍 저장
        Deque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.add(new int[] {i + 1, Integer.parseInt(input[i])});
        }

        // 결과 저장
        List<Integer> result = new ArrayList<>();

        // 시뮬레이션 시작
        while (!deque.isEmpty()) {
            // 현재 풍선 터뜨림
            int[] current = deque.pollFirst();
            int index = current[0];
            int move = current[1];
            result.add(index); // 결과에 추가

            // 이동 처리
            if (deque.isEmpty()) break;

            if (move > 0) {
                // 양수면 오른쪽으로 이동
                for (int i = 1; i < move; i++) {
                    deque.addLast(deque.pollFirst());
                }
            } else {
                // 음수면 왼쪽으로 이동
                for (int i = 0; i < -move; i++) {
                    deque.addFirst(deque.pollLast());
                }
            }
        }

        // 결과 출력
        for (int num : result) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}