import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] cards = new int[N];

        for (int i = 0; i < N; i++) {
            cards[i] = scanner.nextInt();
        }

        int maxSum = 0;

        // 세 카드의 조합을 탐색
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];

                    // M을 넘지 않으면서 최대 합 찾기
                    if (sum <= M && sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.println(maxSum);

    }

}