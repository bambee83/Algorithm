import java.io.*;
import java.util.*;

public class Main {
    static int[][] board = new int[9][9];  // 스도쿠 보드
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 스도쿠 보드 입력 받기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // 백트래킹을 통해 스도쿠 해결
        solve(0, 0);

        // 결과 출력
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 백트래킹을 통한 스도쿠 해결
    public static boolean solve(int row, int col) {
        if (col == 9) {  // 한 행을 다 채우면 다음 행으로 이동
            row++;
            col = 0;
        }
        if (row == 9) {  // 모든 행을 채우면 해결 완료
            return true;
        }

        if (board[row][col] != 0) {  // 이미 숫자가 채워져 있으면 넘어감
            return solve(row, col + 1);
        }

        for (int num = 1; num <= 9; num++) {  // 1부터 9까지 숫자 시도
            if (isSafe(row, col, num)) {  // 숫자를 놓을 수 있으면
                board[row][col] = num;  // 숫자 놓기
                if (solve(row, col + 1)) {  // 다음 칸으로 넘어가며 해결을 시도
                    return true;
                }
                board[row][col] = 0;  // 백트래킹: 실패한 경우 초기화
            }
        }

        return false;  // 가능한 숫자가 없으면 false 반환
    }

    // 해당 위치에 숫자를 놓을 수 있는지 확인
    public static boolean isSafe(int row, int col, int num) {
        // 행(row), 열(col)에서 중복되는 숫자가 있는지 확인
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // 3x3 박스에서 중복되는 숫자가 있는지 확인
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;  // 중복되는 숫자가 없으면 숫자를 놓을 수 있음
    }
}