import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int result = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            // 각 알파벳에 해당하는 시간 계산
            if (ch >= 'A' && ch <= 'C') {
                result += 3; // 숫자 2: A, B, C
            } else if (ch >= 'D' && ch <= 'F') {
                result += 4; // 숫자 3: D, E, F
            } else if (ch >= 'G' && ch <= 'I') {
                result += 5; // 숫자 4: G, H, I
            } else if (ch >= 'J' && ch <= 'L') {
                result += 6; // 숫자 5: J, K, L
            } else if (ch >= 'M' && ch <= 'O') {
                result += 7; // 숫자 6: M, N, O
            } else if (ch >= 'P' && ch <= 'S') {
                result += 8; // 숫자 7: P, Q, R, S
            } else if (ch >= 'T' && ch <= 'V') {
                result += 9; // 숫자 8: T, U, V
            } else if (ch >= 'W' && ch <= 'Z') {
                result += 10; // 숫자 9: W, X, Y, Z
            }
        }

        System.out.println(result);
    }
}
