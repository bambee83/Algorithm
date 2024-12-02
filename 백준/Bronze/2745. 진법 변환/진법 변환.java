import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next(); // B진법 수
        int B = scanner.nextInt(); // 진법 (2 ≤ B ≤ 36)

        // B진법 -> 10진법 변환
        int decimalValue = 0;
        int power = 1; // 현재 자리의 B^i 값을 나타냄

        // N의 각 자리값을 뒤에서부터 처리
        for (int i = N.length() - 1; i >= 0; i--) {
            char currentChar = N.charAt(i);

            // 숫자면 해당 값을 가져옴 ('0' -> 0, '1' -> 1, ..., '9' -> 9)
            if (Character.isDigit(currentChar)) {
                decimalValue += (currentChar - '0') * power;
            }
            // 알파벳이면 A~Z를 10~35로 변환
            else {
                decimalValue += (currentChar - 'A' + 10) * power;
            }

            power *= B; // 자리값 갱신
        }

        // 결과 출력
        System.out.println(decimalValue);
    }
}
