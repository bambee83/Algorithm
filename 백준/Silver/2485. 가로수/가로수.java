import java.io.*;
import java.util.*;

public class Main {
    // 최대공약수(GCD)를 구하는 함수 (유클리드 호제법)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 가로수 개수 입력 받기
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        // 가로수 위치 입력 받기
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        // 가로수 간격 계산
        int[] gaps = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            gaps[i] = trees[i + 1] - trees[i];
        }

        // 모든 간격의 최대공약수(GCD) 구하기
        int gcdValue = gaps[0];
        for (int i = 1; i < gaps.length; i++) {
            gcdValue = gcd(gcdValue, gaps[i]);
        }

        // 새로 심어야 하는 가로수 개수 계산
        int count = 0;
        for (int gap : gaps) {
            count += (gap / gcdValue) - 1;
        }
        System.out.println(count);
    }
}