import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] original = new int[N]; // original = [2, 4, -10, 4, -9]
        int[] sorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            original[i] = Integer.parseInt(st.nextToken());
            sorted[i] = original[i];
        }

        // 정렬 및 중복 제거
        Arrays.sort(sorted); // sorted = [-10, -9, 2, 4, 4]
        Map<Integer, Integer> rankMap = new HashMap<>(); // rankMap = {}
        int rank = 0;

        /*
        좌표값을 순위(rank) 로 매핑
        rankMap = {-10: 0} rank = 1
        rankMap = {-10: 0, -9: 1} rank = 2
        rankMap = {-10: 0, -9: 1, 2: 2} rank = 3
        rankMap = {-10: 0, -9: 1, 2: 2, 4: 3} rank = 4
        다섯 번째 값: 4 > rankMap 에 이미 존재 → 무시.

        최종결과 : rankMap = {-10: 0, -9: 1, 2: 2, 4: 3}
        */
        for (int value : sorted) {
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank++);
            }
        }

        // 압축된 좌표 출력
        for (int value : original) {
            bw.write(rankMap.get(value) + " ");
        }

        bw.flush();
        bw.close();
    }
}