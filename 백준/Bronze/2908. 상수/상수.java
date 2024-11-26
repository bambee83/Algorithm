import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 숫자 뒤집기
        int reversedA = reverseNumber(A);
        int reversedB = reverseNumber(B);

        // 결과 출력
        System.out.println(Math.max(reversedA, reversedB));
    }

    // 숫자를 거꾸로 만드는 메서드
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + (num % 10); // 가장 오른쪽 자리를 추가
            num /= 10; // 오른쪽 자리 제거
        }
        return reversed;
    }
}