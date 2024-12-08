import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = scanner.nextInt();
        }
        Arrays.sort(num);
        System.out.println(num[N-k]);


    }
}