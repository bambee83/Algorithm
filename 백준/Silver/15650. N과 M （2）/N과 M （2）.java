import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] sequence;     // 선택된 수열 저장

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();

        sequence = new int[M]; // M 길이의 수열
        dfs(1, 0); // DFS 탐색 시작 (start: 1, depth: 0)
    }

    // DFS 구현
    static void dfs(int start, int depth) {
        // 종료 조건: 수열의 길이가 M이 되면 출력
        if (depth == M) {
            for (int num : sequence) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        // 현재 숫자부터 N까지 반복
        for (int i = start; i <= N; i++) {
            sequence[depth] = i; // 현재 숫자를 수열에 추가
            dfs(i + 1, depth + 1); // 다음 숫자는 i보다 커야 함
        }
    }
}
