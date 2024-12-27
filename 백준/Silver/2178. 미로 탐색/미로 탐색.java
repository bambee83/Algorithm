import java.io.*;
import java.util.*;

public class Main {
    static int N, M; // 미로 크기
    static int[][] maze; // 미로 배열
    static boolean[][] visited; // 방문 여부 체크 배열
    static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우 이동
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 받기
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                maze[i][j] = line.charAt(j) - '0'; // 미로 배열 저장
            }
        }

        // BFS 실행
        System.out.println(bfs(0, 0)); // 시작점 (0, 0)에서 BFS 시작
    }

    static int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y}); // 시작 지점 추가
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currX = current[0];
            int currY = current[1];

            // 목적지 도달 시 종료
            if (currX == N - 1 && currY == M - 1) {
                return maze[currX][currY];
            }

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int nextX = currX + dx[i];
                int nextY = currY + dy[i];

                // 유효한 범위 내, 이동 가능하고, 방문하지 않은 칸일 경우
                if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < M) {
                    if (maze[nextX][nextY] == 1 && !visited[nextX][nextY]) {
                        visited[nextX][nextY] = true; // 방문 처리
                        maze[nextX][nextY] = maze[currX][currY] + 1; // 칸 수 갱신
                        queue.add(new int[]{nextX, nextY}); // 다음 위치 추가
                    }
                }
            }
        }
        return -1; // 도달 불가능한 경우 (문제 조건상 도달 가능하므로 사용하지 않음)
    }
}
