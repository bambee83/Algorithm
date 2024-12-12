import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 사람 목록 초기화
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        // 요세푸스 순열 계산
        sb.append("<");
        int index = 0;  // 시작 인덱스
        while (!list.isEmpty()) {
            // 다음 제거할 인덱스 계산
            index = (index + K - 1) % list.size();
            sb.append(list.remove(index));  // K번째 사람 제거
            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());
    }
}