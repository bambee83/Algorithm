import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        // 세 점의 좌표 입력
        int[][] points = new int[3][2];
        for (int i = 0; i < 3; i++) {
            points[i][0] = input.nextInt(); // x 좌표
            points[i][1] = input.nextInt(); // y 좌표
        }

        // 네 번째 점의 x, y 좌표 찾기
        int x = findUnique(points[0][0], points[1][0], points[2][0]);
        int y = findUnique(points[0][1], points[1][1], points[2][1]);

        // 결과 출력
        System.out.println(x + " " + y);
    }

    // 세 값 중 유일하게 한 번만 등장하는 값을 반환
    private static int findUnique(int a, int b, int c) {
        if (a == b) return c;
        if (a == c) return b;
        return a;
    }
    
}