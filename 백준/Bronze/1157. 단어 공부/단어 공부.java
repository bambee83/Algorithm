import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase();

        // 알파벳 개수 카운팅 (A-Z)
        int[] alphabetCount = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            alphabetCount[ch - 'A']++;
        }

        // 가장 많이 사용된 알파벳 찾기
        int maxCount = -1;
        char maxChar = '?';
        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                maxChar = (char) (i + 'A');
            } else if (alphabetCount[i] == maxCount) {
                maxChar = '?'; // 빈도가 같은 경우
            }
        }
        System.out.println(maxChar);
    }
}
