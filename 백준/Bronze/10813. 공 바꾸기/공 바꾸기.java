import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();


        // 바구니 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            // i번 바구니와 j번 바구니의 공을 교환 (인덱스는 0부터 시작하므로 i-1, j-1)
            int temp = baskets[i - 1];
            baskets[i - 1] = baskets[j - 1];
            baskets[j - 1] = temp;
        }

        for (int b = 0; b < N  ; b++) {
            System.out.print(baskets[b] + " ");
        }

    }
}
