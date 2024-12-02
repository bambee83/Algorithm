import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // 소인수분해 시작
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                System.out.println(i); // 소인수 출력
                N /= i; // N을 i로 나눈 몫으로 갱신
            }
        }

        // 남은 숫자가 소수인 경우 출력
        if (N > 1) {
            System.out.println(N);
        }
    }
}
