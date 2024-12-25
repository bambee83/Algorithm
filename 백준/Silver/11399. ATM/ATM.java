import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        // 최소 시간 계산
        int total = 0;  // 최종 결과값
        int sum = 0;    // 각 사람이 기다리는 누적 시간
        for (int time : arr) {
            sum += time;  // 현재 사람의 대기 시간 누적
            total += sum; // 총 대기 시간에 더하기
        }

        // 결과 출력
        System.out.println(total);
    }
}