import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] sequence;     // 선택된 수열 저장
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M];
        sb = new StringBuilder();

        dfs(0); // 깊이 0부터 시작

        // 결과 한꺼번에 출력
        System.out.println(sb);
    }

    // DFS 구현
    static void dfs(int depth) {
        // 종료 조건: 수열의 길이가 M이면 StringBuilder에 추가
        if (depth == M) {
            for (int num : sequence) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }

        // 1부터 N까지 반복하면서 수열 생성
        for (int i = 1; i <= N; i++) {
            sequence[depth] = i; // 현재 위치에 숫자 추가
            dfs(depth + 1); // 다음 깊이로 이동
        }
    }
}
