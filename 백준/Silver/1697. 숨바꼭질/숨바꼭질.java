import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //  수빈이가 있는 위치
        int K = Integer.parseInt(st.nextToken()); // 동생이 있는 위치

        // BFS를 위한 큐
        Queue<Integer> queue = new LinkedList<>();
        // 방문 여부 및 시간을 기록하기 위한 배열
        int[] visited = new int[100001]; // 최대 100,000까지
        // 시작 위치 초기화
        queue.add(N);
        visited[N] = 1; // 시작 위치 방문 처리 (1초로 설정)

        while (!queue.isEmpty()) {
            int current = queue.poll();

            // 동생 위치에 도달하면 종료
            if (current == K) {
                System.out.println(visited[current] - 1); // 시작 위치를 1로 설정했으므로 -1
                return;
            }

            // 이동 가능한 위치 탐색
            for (int next : new int[]{current - 1, current + 1, current * 2}) {
                // 범위 내에 있고, 아직 방문하지 않은 경우
                if (next >= 0 && next <= 100000 && visited[next] == 0) {
                    queue.add(next);
                    visited[next] = visited[current] + 1; // 시간 갱신
                }
            }
        }
        
    }
}
