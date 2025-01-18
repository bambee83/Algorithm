import java.io.*;
import java.util.*;

public class Main {
    // 최대공약수를 구하는 메서드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 최소공배수 계산
            int gcdValue = gcd(a, b);
            int lcm = a * (b / gcdValue); // a와 b의 최소공배수

            sb.append(lcm).append("\n");
        }
        System.out.print(sb);
    }
}