import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        int count = 0;
        int num = 666; // 첫 번째 종말의 수

        // 종말의 수를 순차적으로 찾기
        while (true) {
            if (String.valueOf(num).contains("666")) {
                count++;
            }

            // N번째 종말의 수를 찾으면 출력
            if (count == N) {
                System.out.println(num);
                break;
            }

            num++;
        }
    }
}