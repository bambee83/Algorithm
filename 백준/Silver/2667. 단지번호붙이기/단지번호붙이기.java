import java.io.*;
import java.util.*;

public class Main {
    // 상, 하, 좌, 우 방향
    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};
    
    // 지도 정보와 방문 여부를 기록할 배열
    private static int[][] map;
    private static boolean[][] visited;
    private static int N;
    private static List<Integer> apartmentSizes = new ArrayList<>();

    // DFS 함수
    public static void dfs(int x, int y) {
        // 스택에 좌표를 넣고, 방문할 집의 수를 증가
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{x, y});
        visited[x][y] = true;
        int size = 1;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int cx = cur[0];
            int cy = cur[1];

            // 4방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                // 새로운 좌표가 범위 내에 있고, 집이 존재하며, 아직 방문하지 않았다면
                if (nx >= 0 && nx < N && ny >= 0 && ny < N && map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    stack.push(new int[]{nx, ny});
                    size++;
                }
            }
        }

        // 단지의 크기 저장
        apartmentSizes.add(size);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        // 지도 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // 단지 번호 붙이기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);  // 연결된 집들을 DFS로 탐색하여 단지 크기 구하기
                }
            }
        }
        Collections.sort(apartmentSizes);  // 단지 크기를 오름차순으로 정렬
        System.out.println(apartmentSizes.size());  // 단지 수 출력
        for (int size : apartmentSizes) {
            System.out.println(size);  // 각 단지의 집의 수 출력
        }
    }
}