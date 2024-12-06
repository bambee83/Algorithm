import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong(); // 입력 크기 n

        // 수행 횟수 계산: n(n-1)(n-2)/6
        long executionCount = n * (n - 1) * (n - 2) / 6;
        System.out.println(executionCount);
        System.out.println(3);
    }

}