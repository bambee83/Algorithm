import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 받기
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        // 소수 판별 배열 (true = 소수)
        boolean[] isPrime = new boolean[N + 1];
        sieveOfEratosthenes(isPrime, N);

        // M 이상 N 이하의 소수 출력
        for (int i = M; i <= N; i++) {
            if (isPrime[i]) {
                bw.write(i + "\n");
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

    // 에라토스테네스의 체 알고리즘
    private static void sieveOfEratosthenes(boolean[] isPrime, int max) {
        if (max < 2) return;

        // 모든 수를 소수(true)로 초기화
        for (int i = 2; i <= max; i++) {
            isPrime[i] = true;
        }

        // 2부터 sqrt(N)까지 반복하며 배수 제거
        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {  // 소수이면
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;  // 배수는 소수가 아님
                }
            }
        }
    }
}