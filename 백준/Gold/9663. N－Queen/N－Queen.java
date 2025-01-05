import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int count = 0; // 가능한 경우의 수
    static int[] queens; // 각 행에 퀸이 놓인 열 정보


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        queens = new int[N];
        solve(0); // 첫 번째 행부터 시작
        System.out.println(count);
    }

    // 백트래킹을 사용한 퀸 배치
    static void solve(int row) {
        if (row == N) { // N개의 퀸을 모두 배치한 경우
            count++;
            return;
        }

        // 현재 행(row)의 각 열(column)에 퀸을 배치 시도
        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) { // 유효한 위치인지 검사
                queens[row] = col; // 퀸 배치
                solve(row + 1); // 다음 행으로 이동
                // 백트래킹: 이전 상태로 돌아감 (queens[row] 값을 덮어씀)
            }
        }
    }

    // 퀸을 놓을 수 있는지 확인
    static boolean isSafe(int row, int col) {
        for (int prevRow = 0; prevRow < row; prevRow++) {
            // 같은 열에 퀸이 있는 경우
            if (queens[prevRow] == col) {
                return false;
            }
            // 같은 ↖︎ 대각선에 퀸이 있는 경우
            if (Math.abs(prevRow - row) == Math.abs(queens[prevRow] - col)) {
                return false;
            }
        }
        return true;
    }
}