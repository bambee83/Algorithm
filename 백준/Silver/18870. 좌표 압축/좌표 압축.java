import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] sorted = original.clone();
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int value : sorted) {
            if (!map.containsKey(value)) { // 중복 제거
                map.put(value, index++);  // 값에 대해 압축된 값 매핑
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int value : original) {
            sb.append(map.get(value)).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}