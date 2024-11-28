import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        // 도화지 크기: 100x100
        boolean[][] paper = new boolean[100][100];
        // 색종이 개수 입력
        int n = scanner.nextInt();
        // 색종이 정보 입력 및 도화지에 표시
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt(); // 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이 거리
            int y = scanner.nextInt(); // 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이 거리

            // 색종이 크기: 10x10
            for (int row = x; row < x + 10; row++) {
                for (int col = y; col < y + 10; col++) {
                    paper[row][col] = true; // 색종이가 붙은 영역 표시
                }
            }
        }
        // 검은 영역의 넓이 계산
        int area = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }
        System.out.println(area);

    }
}
