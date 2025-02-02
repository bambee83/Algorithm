import java.io.*;

public class Main {
    static final int MAX = 1_000_000;
    static boolean[] isPrime = new boolean[MAX + 1]; // 소수 여부 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 1. 에라토스테네스의 체를 이용해 소수를 미리 구함
        sieveOfEratosthenes();

        // 2. 테스트 케이스 개수 입력
        int T = Integer.parseInt(br.readLine());
        
        // 3. 각 테스트 케이스 처리
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;

            // 4. a + b = N 형태에서 a가 소수인지 확인 (a <= b 조건 적용)
            for (int a = 2; a <= N / 2; a++) {
                int b = N - a;
                if (isPrime[a] && isPrime[b]) count++;
            }

            // 5. 결과 저장
            sb.append(count).append("\n");
        }

        System.out.print(sb);
    }

    // 에라토스테네스의 체: 소수 판별
    private static void sieveOfEratosthenes() {
        // 모든 수를 소수(true)로 초기화
        for (int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }

        // 2부터 sqrt(MAX)까지 반복하여 배수를 제거
        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}