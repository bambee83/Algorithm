import java.io.*;
import java.util.*;

public class Main {
    static int[][] box; // 토마토 상자 상태
    static int[] dx = {0, 0, -1, 1}; // 상, 하, 좌, 우
    static int[] dy = {-1, 1, 0, 0};
    static int n, m; // 세로 크기 n, 가로 크기 m
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken()); // 가로 크기
        n = Integer.parseInt(st.nextToken()); // 세로 크기

        box = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();

        // 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) {
                    // 익은 토마토의 위치를 큐에 삽입
                    queue.add(new int[] {i, j});
                }
            }
        }

        // BFS 실행
        int result = bfs(queue);

        // 익지 않은 토마토가 남아있는지 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(result);
    }

    static int bfs(Queue<int[]> queue) {
        int days = -1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            days++; // 하루 경과

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];

                // 인접한 네 방향 탐색
                for (int dir = 0; dir < 4; dir++) {
                    int nx = x + dx[dir];
                    int ny = y + dy[dir];

                    // 범위를 벗어나거나 이미 방문한 경우, 또는 -1인 경우
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m || box[nx][ny] != 0) {
                        continue;
                    }

                    // 익지 않은 토마토를 익은 상태로 변경
                    box[nx][ny] = 1;
                    queue.add(new int[] {nx, ny});
                }
            }
        }
        return days;
    }
}