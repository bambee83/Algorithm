import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong(); // 10진법 수
        int B = scanner.nextInt();   // 변환할 진법 (2 ≤ B ≤ 36)

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

        // 10진법 수를 B진법으로 변환
        while (N > 0) {
            long remainder = N % B; // 나머지 계산
            if (remainder < 10) {
                // 0~9는 숫자로 추가
                result.append((char) ('0' + remainder));
            } else {
                // 10 이상은 A~Z로 변환
                result.append((char) ('A' + (remainder - 10)));
            }
            N /= B; // 몫으로 업데이트
        }
        System.out.println(result.reverse());
    }
}
