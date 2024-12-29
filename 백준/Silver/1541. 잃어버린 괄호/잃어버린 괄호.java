import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 1. '-'를 기준으로 식 분리
        String[] parts = input.split("-");

        // 2. 첫 번째 값을 기준으로 결과값 초기화
        int result = sum(parts[0]);

        // 3. 나머지 값들을 모두 빼줌
        for (int i = 1; i < parts.length; i++) {
            result -= sum(parts[i]);
        }
        System.out.println(result);
    }

    // '+'로 나뉜 부분을 계산
    private static int sum(String expression) {
        String[] numbers = expression.split("\\+");
        int total = 0;
        for (String number : numbers) {
            total += Integer.parseInt(number);
        }
        return total;
    }
}