import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(); // 현재 x 좌표
        int y = input.nextInt(); // 현재 y 좌표
        int w = input.nextInt(); // 직사각형의 가로 길이
        int h = input.nextInt(); // 직사각형의 세로 길이

        // 경계선까지의 거리 계산
        int distanceToLeft = x;       // 왼쪽 경계선까지의 거리
        int distanceToRight = w - x;  // 오른쪽 경계선까지의 거리
        int distanceToBottom = y;     // 아래쪽 경계선까지의 거리
        int distanceToTop = h - y;    // 위쪽 경계선까지의 거리

        // 최소 거리 계산
        int minDistance = Math.min(Math.min(distanceToLeft, distanceToRight),
                Math.min(distanceToBottom, distanceToTop));

        // 결과 출력
        System.out.println(minDistance);
    }
}