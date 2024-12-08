import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입출력을 위한 BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄: 입력된 수의 개수 N
        int N = Integer.parseInt(br.readLine());

        // 숫자의 범위가 1 ~ 10,000이므로 크기가 10,001인 배열 생성
        int[] count = new int[10001];

        // 입력값을 배열에 카운트
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }

        // 카운트 배열을 기반으로 정렬된 결과 출력
        for (int i = 1; i <= 10000; i++) {
            while (count[i] > 0) {
                bw.write(i + "\n");
                count[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
}