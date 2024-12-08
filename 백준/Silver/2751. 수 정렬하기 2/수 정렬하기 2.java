import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 번째 줄: 수의 개수 N
        int N = Integer.parseInt(br.readLine());

        // TreeSet을 사용해 중복 제거 및 정렬
        TreeSet<Integer> numbers = new TreeSet<>();

        // 입력을 TreeSet에 저장 (자동 정렬 + 중복 제거)
        for (int i = 0; i < N; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }
        // TreeSet의 값을 출력
        for (int num : numbers) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();


    }
}