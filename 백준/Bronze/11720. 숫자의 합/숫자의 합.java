import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 숫자의 개수
        String numbers = sc.next(); // 공백 없이 쓰인 숫자들

        int sum = 0;

        // 숫자 문자열의 각 문자를 정수로 변환하여 합산
        for (int i = 0; i < N; i++) {
            sum += numbers.charAt(i) - '0'; // char을 int로 변환
        }

        System.out.println(sum); // 합 출력
    }
}
