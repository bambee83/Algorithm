import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt(); // 입력값 읽기
            if (n == -1) {
                break; // 종료 조건
            }

            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;

            // 약수 찾기
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    divisors.add(i);
                    sum += i;

                    if (i != 1 && i != n / i) { // 중복 방지
                        divisors.add(n / i);
                        sum += n / i;
                    }
                }
            }

            // 완전수 판별
            if (sum == n) {
                divisors.sort(null); // 약수 정렬
                System.out.print(n + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    System.out.print(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }

    }
}
