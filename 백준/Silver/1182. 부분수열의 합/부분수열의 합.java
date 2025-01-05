import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;
        // 비트마스크를 이용하여 부분수열을 확인
        for (int mask = 1; mask < (1 << N); mask++) {
            int sum = 0;
            // 현재 mask에 해당하는 부분수열의 합을 구함
            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += arr[i];
                }
            }
            // 부분수열의 합이 S와 일치하면 카운트 증가
            if (sum == S) {
                result++;
            }
        }

        System.out.println(result);
    }
}