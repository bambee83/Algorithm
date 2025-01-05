import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] sequence;     // 선택된 수열 저장
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 입력
        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M];
        sb = new StringBuilder();

        dfs(0, 1); // 깊이 0, 시작 숫자 1부터 시작

        // 결과 출력
        System.out.println(sb);
    }

    // DFS 구현
    static void dfs(int depth, int start) {
        // 종료 조건: 수열의 길이가 M이면 StringBuilder에 추가
        if (depth == M) {
            for (int num : sequence) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        // start부터 N까지 숫자 선택
        for (int i = start; i <= N; i++) {
            sequence[depth] = i; // 현재 위치에 숫자 추가
            dfs(depth + 1, i); // 다음 깊이로 이동 (같은 숫자 선택 가능)
        }
    }
}
