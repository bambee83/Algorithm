import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // 개행문자제거

        StringBuilder result = new StringBuilder(); // 결과 저장

        for (int i = 0; i < N; i++) {
            String S = sc.nextLine();
            int length = S.length();
            result.append(S.charAt(0)).append(S.charAt(length - 1)).append("\n");
        }

        System.out.println(result);     // 한 번에 출력

    }
}
