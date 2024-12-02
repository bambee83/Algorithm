import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int V = scanner.nextInt();

        // 정상에 도달하기 위한 총 일수 계산
        int days = (int) Math.ceil((double) (V - A) / (A - B)) + 1;
        System.out.println(days);
    }
}
