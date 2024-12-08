import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 줄에서 숫자의 개수 N 입력 받음
        int N = scanner.nextInt();
        int[] numbers = new int[N];

        // N개의 숫자를 입력 받아 배열에 저장
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        // 배열을 오름차순으로 정렬
        Arrays.sort(numbers);
        
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}