import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] lengths = new long[K];
        long max = 0;
        for (int i = 0; i < K; i++) {
            lengths[i] = Long.parseLong(br.readLine());
            max = Math.max(max, lengths[i]);
        }
        long left = 1; // 최소 길이
        long right = max; // 최대 길이
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2; // 중간 길이
            long count = 0;

            // 중간 길이로 잘랐을 때 나오는 랜선 개수 계산
            for (long length : lengths) {
                count += length / mid;
            }

            if (count >= N) { // 랜선을 충분히 만들 수 있으면 길이를 늘린다.
                result = mid;
                left = mid + 1;
            } else { // 랜선을 충분히 만들 수 없으면 길이를 줄인다.
                right = mid - 1;
            }
        }

        System.out.println(result);

    }
}