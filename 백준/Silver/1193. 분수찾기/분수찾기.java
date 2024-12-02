import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        // 대각선 번호 찾기
        int diagonal = 0; // 대각선 번호
        int sum = 0; // 대각선 이전까지의 총 개수 합
        while (sum < X) {
            diagonal++;
            sum += diagonal;
        }

        // 대각선 내에서 X의 위치
        int indexInDiagonal = X - (sum - diagonal);

        // 분수 계산
        int numerator, denominator;
        if (diagonal % 2 == 0) {
            // 짝수 대각선: 1/n, 2/(n-1), ..., n/1
            numerator = indexInDiagonal;
            denominator = diagonal - indexInDiagonal + 1;
        } else {
            // 홀수 대각선: n/1, (n-1)/2, ..., 1/n
            numerator = diagonal - indexInDiagonal + 1;
            denominator = indexInDiagonal;
        }

        // 결과 출력
        System.out.println(numerator + "/" + denominator);
/*

        (1 ,1)
        (1, 2) (2, 1)
        (3, 1) (2, 2) (1, 3)
        (1, 4) (2, 3) (3, 2) (4, 1)
        (1, 5) (2, 4) (3, 3) (4, 2) (5, 1)
*/

    }
}
