import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // 입력 받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 버퍼 비우기

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }

        int minPaint = Integer.MAX_VALUE;

        // 8x8 영역 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                // 칠해야 하는 칸 수 계산
                int count1 = getPaintCount(board, i, j, 'W'); // 왼쪽 위가 흰색인 경우
                int count2 = getPaintCount(board, i, j, 'B'); // 왼쪽 위가 검은색인 경우

                // 최솟값 갱신
                minPaint = Math.min(minPaint, Math.min(count1, count2));
            }
        }

        // 결과 출력
        System.out.println(minPaint);
    }

    // 특정 시작 패턴에 따라 칠해야 하는 칸 수 계산
    public static int getPaintCount(char[][] board, int startX, int startY, char startColor) {
        int count = 0;
        char currentColor = startColor;

        for (int i = startX; i < startX + 8; i++) {
            for (int j = startY; j < startY + 8; j++) {
                // 현재 칸이 올바르지 않다면 칠해야 함
                if (board[i][j] != currentColor) {
                    count++;
                }
                // 다음 칸 색 변경
                currentColor = (currentColor == 'W') ? 'B' : 'W';
            }
            // 행이 바뀌면 색 변경
            currentColor = (currentColor == 'W') ? 'B' : 'W';
        }

        return count;
    }
}