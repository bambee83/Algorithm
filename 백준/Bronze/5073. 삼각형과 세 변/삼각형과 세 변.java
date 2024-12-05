import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();

        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            // 종료 조건
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            // 세 변을 오름차순 정렬하여 가장 긴 변 확인
            int[] sides = {a, b, c};
            Arrays.sort(sides);
            int max = sides[2];
            int sumOfOtherSides = sides[0] + sides[1];

            // 삼각형 조건 확인
            if (max >= sumOfOtherSides) {
                System.out.println("Invalid");
            } else if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

    }
}