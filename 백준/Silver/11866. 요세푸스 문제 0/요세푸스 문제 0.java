import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        // 1부터 N까지 Queue에 삽입
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 요세푸스 순열 생성
        while (!queue.isEmpty()) {
            // K-1번 앞의 사람들을 뒤로 이동
            for (int i = 0; i < K - 1; i++) {
                queue.add(queue.poll());
            }
            // K번째 사람을 제거하고 결과에 추가
            sb.append(queue.poll());
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}