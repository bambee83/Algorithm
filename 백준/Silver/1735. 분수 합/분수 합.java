import java.util.*;

public class Main {
    // 최대공약수(GCD) 구하기
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 최소공배수(LCM) 구하기
    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int A = sc.nextInt(); // 첫 번째 분자의 값
        int B = sc.nextInt(); // 첫 번째 분모의 값
        int C = sc.nextInt(); // 두 번째 분자의 값
        int D = sc.nextInt(); // 두 번째 분모의 값

        sc.close();

        // 최소공배수로 통분
        int lcm = lcm(B, D);
        int sumNumerator = (A * (lcm / B)) + (C * (lcm / D)); // 변환된 분자의 합
        int sumDenominator = lcm; // 통분한 분모

        // 기약분수 변환 (최대공약수로 약분)
        int gcd = gcd(sumNumerator, sumDenominator);
        sumNumerator /= gcd;
        sumDenominator /= gcd;

        System.out.println(sumNumerator + " " + sumDenominator);
    }
}