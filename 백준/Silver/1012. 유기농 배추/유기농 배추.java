import java.io.*;
import java.util.*;

public class Main {
    // 상, 하, 좌, 우 방향
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    
    // DFS 함수
    public static void dfs(int x, int y, int M, int N, int[][] matrix, boolean[][] visited) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int cx = cur[0];
            int cy = cur[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 새로운 좌표가 범위 내에 있고, 배추가 있고, 아직 방문하지 않았다면
                if (nx >= 0 && nx < M && ny >= 0 && ny < N && matrix[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수

        // 테스트 케이스 반복
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); // 가로길이
            int N = Integer.parseInt(st.nextToken()); // 세로길이
            int K = Integer.parseInt(st.nextToken()); // 배추가 심어져 있는 위치의 개수

            // 배추밭 초기화
            int[][] matrix = new int[M][N];
            boolean[][] visited = new boolean[M][N];

            // 배추 위치 설정
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                matrix[x][y] = 1;
            }

            // 배추흰지렁이 수를 셈
            int count = 0;

            // 모든 위치를 탐색
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    // 배추가 있고, 아직 방문하지 않았다면
                    if (matrix[i][j] == 1 && !visited[i][j]) {
                        // DFS를 통해 연결된 배추를 모두 방문
                        dfs(i, j, M, N, matrix, visited);
                        // 새로운 단지를 발견했으므로 배추흰지렁이 수 증가
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}