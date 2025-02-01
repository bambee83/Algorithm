import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 테스트 케이스 개수

        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(findNextPrime(n));
        }
    }

    // n 이상인 가장 작은 소수 찾기
    private static long findNextPrime(long n) {
        if (n <= 2) return 2;
        if (n % 2 == 0) n++;  // 짝수라면 홀수로 변경

        while (!isPrime(n)) {
            n += 2;  // 홀수만 검사하여 효율성 증가
        }
        return n;
    }

    // 소수 판별 함수 (빠른 소수 판별)
    private static boolean isPrime(long num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        // 6k ± 1 형태의 수만 검사하여 최적화
        for (long i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}