import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 입력된 수의 개수
        int Cnt = 0; // 소수 개수 카운트

        // N개의 수에 대해 소수 판별
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (isPrime(num)) { // 소수라면
                Cnt++; // 소수 개수 증가
            }
        }

        System.out.println(Cnt); // 소수 개수 출력
        scanner.close();
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false; // 2 미만은 소수가 아님
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // 약수가 존재하면 소수가 아님
            }
        }
        return true; // 소수
    }
}
