import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // 팰린드롬 여부 확인
        if (isPalindrome(word)) {
            System.out.println(1); // 팰린드롬이면 1 출력
        } else {
            System.out.println(0); // 팰린드롬이 아니면 0 출력
        }
    }

    // 팰린드롬 확인 함수
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
