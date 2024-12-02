import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        // 각 테스트 케이스 처리
        for (int t = 0; t < T; t++) {
            int cents = scanner.nextInt(); // 거스름돈 (센트 단위)
            // 동전 개수 계산
            int quarters = cents / 25;
            cents %= 25;

            int dimes = cents / 10;
            cents %= 10;

            int nickels = cents / 5;
            cents %= 5;

            int pennies = cents; // 남은 금액은 페니로 모두 처리

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }
    }
}
