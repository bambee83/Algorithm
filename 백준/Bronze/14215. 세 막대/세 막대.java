import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
        // 세 변 입력받기
        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            sides[i] = input.nextInt();
        }

        // 변 정렬
        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        // 삼각형 조건 확인 및 조정
        if (c >= a + b) {
            c = a + b - 1;
        }

        System.out.println(a + b + c);

    }
}