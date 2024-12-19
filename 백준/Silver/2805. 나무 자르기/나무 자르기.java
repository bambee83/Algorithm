import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] trees = new long[N];
        st = new StringTokenizer(br.readLine());
        long max = 0; // 나무 중 최대 높이 저장
        for (int i = 0; i < N; i++) {
            trees[i] = Long.parseLong(st.nextToken());
            max = Math.max(max, trees[i]);
        }

        long low = 0, high = max;
        long result = 0;
        
        while (low <= high) {
            long mid = (low + high) / 2; // 절단기 높이 설정
            long total = 0;
            // 잘린 나무의 총 길이 계산
            for (long tree : trees) {
                if (tree > mid) {
                    total += tree - mid;
                }
            }
            // 자른 나무 길이가 M 이상이면 높이를 높인다.
            if (total >= M) {
                result = mid; // 조건을 만족하는 높이 저장
                low = mid + 1;
            } else { // 자른 나무 길이가 부족하면 높이를 낮춘다.
                high = mid - 1;
            }
        }
        System.out.println(result);
    }
}