import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // 그래프 생성
        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a); // 양방향 간선
        }

        // 각 정점의 리스트를 정렬 (정점 번호가 작은 것부터 방문하도록)
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        // DFS와 BFS에서 방문 여부를 체크할 배열
        boolean[] dfsVisited = new boolean[N + 1];
        boolean[] bfsVisited = new boolean[N + 1];

        // DFS 함수
        StringBuilder dfsResult = new StringBuilder();
        dfs(V, graph, dfsVisited, dfsResult);
        System.out.println(dfsResult.toString().trim());

        // BFS 함수
        StringBuilder bfsResult = new StringBuilder();
        bfs(V, graph, bfsVisited, bfsResult);
        System.out.println(bfsResult.toString().trim());
    }

    // DFS 함수
    public static void dfs(int v, ArrayList<Integer>[] graph, boolean[] visited, StringBuilder result) {
        visited[v] = true;
        result.append(v).append(" ");

        for (int neighbor : graph[v]) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, result);
            }
        }
    }

    // BFS 함수
    public static void bfs(int v, ArrayList<Integer>[] graph, boolean[] visited, StringBuilder result) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            result.append(current).append(" ");

            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }
}