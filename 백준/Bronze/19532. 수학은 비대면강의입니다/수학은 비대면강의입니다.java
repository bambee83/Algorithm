import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int x = 0, y = 0;
        // 단순 대입법으로 해결
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a * i + b * j == c && d * i + e * j == f) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(x + " " + y);
    }
}