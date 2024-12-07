import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        // 5kg 봉지를 최대한 사용
        while (N >= 0) {
            if (N % 5 == 0) { // 5kg으로 나눠떨어질 경우
                count += N / 5; // 5kg 봉지의 개수 추가
                System.out.println(count);
                return;
            }
            // 나눠떨어지지 않으면 3kg 봉지로 변경
            N -= 3;
            count++;
        }

        // 정확히 나눌 수 없는 경우
        System.out.println(-1);

    }
}