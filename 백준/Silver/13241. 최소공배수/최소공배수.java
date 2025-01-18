import java.io.*;
import java.util.*;

public class Main {
    // 최대공약수를 구하는 메서드 (유클리드 호제법)
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        // 최소공배수 계산
        long gcdValue = gcd(a, b);
        long lcm = a * (b / gcdValue); // LCM 공식: a * (b / GCD(a, b))

        // 출력
        System.out.println(lcm);
    }
}