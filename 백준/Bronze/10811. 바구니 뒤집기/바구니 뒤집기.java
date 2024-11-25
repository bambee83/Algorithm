import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 개수
        int M = sc.nextInt(); // 뒤집기 명령 수

        // 바구니 초기화
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i+1;
        }

        for (int a = 0; a < M; a++) {
            int i = sc.nextInt(); // 시작 바구니
            int j = sc.nextInt(); // 끝 바구니

            reverse(baskets, i - 1, j - 1);
        }

        // 결과 출력
        for (int num : baskets) {
            System.out.print(num + " ");
        }
    }

        private static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
}
