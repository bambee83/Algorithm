import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // 종료 조건
            if (A == 0 && B == 0) {
                break;
            }

            // 관계 판단
            if (B % A == 0) {
                builder.append("factor").append("\n"); // 약수인 경우
            } else if (A % B == 0) {
                builder.append("multiple").append("\n"); // 배수인 경우
            } else {
                builder.append("neither").append("\n"); // 둘 다 아닌 경우
            }
        }
        System.out.println(builder);
    }
}
