import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 입력 문자열을 문자 배열로 변환
        char[] digits = input.toCharArray();

        // 문자 배열 정렬
        Arrays.sort(digits);

        // 문자 배열을 뒤집어서 내림차순 정렬
        StringBuilder result = new StringBuilder(new String(digits));
        System.out.println(result.reverse());
    }
}