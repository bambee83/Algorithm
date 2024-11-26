import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
//

        StringBuilder builder = new StringBuilder();

        for (int k = 0; k < T; k++) {
            int r = sc.nextInt();
            String S = sc.next();


            for (int j = 0; j < S.length(); j++) { // 문자열 S의 각 문자에 대해
                for (int i = 0; i < r; i++) { // r번 반복
                    builder.append(S.charAt(j)); // 문자를 builder에 추가
                }
            }

            builder.append("\n");
        }


        System.out.println(builder);
    }
}
