import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int result = 0;

        // 생성자의 가능 범위: N - 9 * 자리수 ~ N
        for (int i = Math.max(1, N - 9 * String.valueOf(N).length()); i < N; i++) {
            int sum = i;
            int temp = i;

            // 각 자리수의 합 계산
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            // 생성자인지 확인
            if (sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
}
}