import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 도시의 개수
        // 도로의 길이 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] distances = new long[N - 1];
        for (int i = 0; i < N - 1; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }

        // 주유소 가격 배열
        st = new StringTokenizer(br.readLine());
        long[] prices = new long[N];
        for (int i = 0; i < N; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }

        // 최소 비용 계산
        long minPrice = prices[0]; // 현재 최소 주유 가격
        long totalCost = 0;       // 총 비용

        for (int i = 0; i < N - 1; i++) {
            // 현재 구간의 비용 계산
            totalCost += minPrice * distances[i];

            // 다음 도시의 주유 가격이 더 싸면 갱신
            if (prices[i + 1] < minPrice) {
                minPrice = prices[i + 1];
            }
        }
        System.out.println(totalCost);
    }
}
