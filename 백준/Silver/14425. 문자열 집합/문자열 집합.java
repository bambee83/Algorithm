import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        // 집합 S에 포함된 문자열 입력
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            stringSet.add(br.readLine());
        }

        // 검사해야 하는 문자열 입력 및 확인
        int count = 0;
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (stringSet.contains(query)) {
                count++;
            }
        }
        bw.write(count + "\n");

        bw.flush();
        bw.close();
    }
}