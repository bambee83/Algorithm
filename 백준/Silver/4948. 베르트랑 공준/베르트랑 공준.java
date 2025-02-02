import java.io.*;

public class Main {
    static final int MAX = 246912; // 문제에서 2*123456까지 범위를 요구함
    static boolean[] isPrime = new boolean[MAX + 1]; // 소수 판별 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 1. 에라토스테네스의 체로 소수를 미리 구함
        sieveOfEratosthenes();
        
        // 2. 여러 개의 테스트 케이스 처리
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break; // 0이면 종료
            
            // 3. [n+1, 2n] 범위에서 소수 개수 카운트
            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) count++;
            }
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }

    // 에라토스테네스의 체 알고리즘
    private static void sieveOfEratosthenes() {
        // 초기화: 모든 수를 소수(true)로 설정
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        // 2부터 sqrt(MAX)까지의 배수를 제거
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false; // 배수는 소수가 아님
                }
            }
        }
    }
}