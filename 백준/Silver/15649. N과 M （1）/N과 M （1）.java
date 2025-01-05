import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static boolean[] visited;  // 방문 여부 체크
    static int[] sequence;     // 선택된 수열 저장

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N + 1];  // 1부터 N까지
        sequence = new int[M];        // M 길이의 수열

        dfs(0);  // DFS 탐색 시작
    }

    // DFS 구현
    static void dfs(int depth) {
        // 종료 조건: 수열의 길이가 M이 되면 출력
        if (depth == M) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        // 1부터 N까지 반복
        for (int i = 1; i <= N; i++) {
            // 방문하지 않은 숫자만 선택
            if (!visited[i]) {
                visited[i] = true;      // 숫자 사용 처리
                sequence[depth] = i;    // 현재 수열에 추가
                dfs(depth + 1);         // 다음 깊이 탐색
                visited[i] = false;     // 숫자 사용 취소 (백트래킹)
            }
        }
    }
}