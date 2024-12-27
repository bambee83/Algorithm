import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        for (int i = N - 1; i >= 0; i--) {
            // 현재 동전으로 최대한 많이 사용
            if (K >= coins[i]) {
                count += K / coins[i]; // 동전 개수 추가
                K %= coins[i]; // 남은 금액 업데이트
            }
        }
        System.out.println(count);
    }
}
