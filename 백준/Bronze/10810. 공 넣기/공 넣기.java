import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];

        for (int m = 0; m < M; m++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int b = i - 1; b < j; b++) {
                baskets[b] = k;
            }
        }
        for (int b = 0; b < N; b++) {
            System.out.print(baskets[b] + " ");
        }


    }
}

