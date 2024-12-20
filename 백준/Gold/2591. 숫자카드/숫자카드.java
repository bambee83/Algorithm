import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        // DP 배열 생성
        int[] dp = new int[n + 1];
        dp[0] = 1; // 초기 조건

        for (int i = 1; i <= n; i++) {
            // 한 자리 숫자 확인
            int oneDigit = s.charAt(i - 1) - '0';
            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            // 두 자리 숫자 확인
            if (i > 1) {
                int twoDigits = Integer.parseInt(s.substring(i - 2, i));
                if (twoDigits >= 10 && twoDigits <= 34) {
                    dp[i] += dp[i - 2];
                }
            }
        }
        System.out.println(dp[n]);
    }
}