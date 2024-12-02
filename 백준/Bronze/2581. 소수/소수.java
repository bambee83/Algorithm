import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int sum = 0; // 소수의 합
        int min = Integer.MAX_VALUE; // 소수의 최솟값
        boolean foundPrime = false; // 소수 발견 여부

        // M에서 N까지 모든 수에 대해 소수 판별
        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i; // 합에 더하기
                if (i < min) {
                    min = i; // 최솟값 갱신
                }
                foundPrime = true;
            }
        }

        // 결과 출력
        if (foundPrime) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false; // 1과 0은 소수가 아님
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // 약수가 존재하면 소수가 아님
            }
        }
        return true; // 소수
    }

}
