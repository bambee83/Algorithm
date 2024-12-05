import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // 점의 개수
        int xMin = Integer.MAX_VALUE, xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE, yMax = Integer.MIN_VALUE;

        // 모든 점의 좌표 입력과 동시에 최소/최대 값 계산
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            xMin = Math.min(xMin, x);
            xMax = Math.max(xMax, x);
            yMin = Math.min(yMin, y);
            yMax = Math.max(yMax, y);
        }

        // 직사각형의 넓이 계산
        int width = xMax - xMin;
        int height = yMax - yMin;

        System.out.println(width * height);
    }
}