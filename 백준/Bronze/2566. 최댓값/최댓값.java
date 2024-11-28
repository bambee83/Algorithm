import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[][] grid = new int[9][9]; // 9x9 격자판
        int maxValue = Integer.MIN_VALUE; // 최댓값을 가장 작은 값으로 초기화
        int maxRow = 0; // 최댓값의 행
        int maxCol = 0; // 최댓값의 열

        // 9x9 격자 입력받기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = scanner.nextInt();
                // 최댓값 갱신
                if (grid[i][j] > maxValue) {
                    maxValue = grid[i][j];
                    maxRow = i + 1; // 행 번호 (1부터 시작)
                    maxCol = j + 1; // 열 번호 (1부터 시작)
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(maxRow + " " + maxCol);

    }
}
