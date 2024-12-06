import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // 수행 횟수 계산: (n^2 - n) / 2
        long executionCount = (long) n * (n - 1) / 2;
        System.out.println(executionCount);
        System.out.println(2);
    }
}


