import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph; // 인접 리스트
    static boolean[] visited; // 방문 여부 체크 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        graph = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u); // 방향 없는 그래프이므로 양방향 추가
        }

        // 연결 요소 개수 계산
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i); // 방문하지 않은 정점에서 DFS 시작
                count++; // 탐색이 끝날 때마다 연결 요소 개수 증가
            }
        }

        System.out.println(count); // 연결 요소의 개수 출력
    }

    // DFS 구현
    static void dfs(int node) {
        visited[node] = true; // 현재 정점 방문 처리
        for (int neighbor : graph[node]) { // 인접 정점 탐색
            if (!visited[neighbor]) {
                dfs(neighbor); // 재귀 호출로 깊이 탐색
            }
        }
    }
}
