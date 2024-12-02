import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        ArrayList<Integer> divisors = new ArrayList<>();

        // N의 약수 찾기
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                divisors.add(i);
            }
        }

        // K번째 약수 출력 또는 0 출력
        if (divisors.size() >= K) {
            System.out.println(divisors.get(K - 1)); // K번째 약수
        } else {
            System.out.println(0); // 약수의 개수가 K보다 적음
        }


    }
}
