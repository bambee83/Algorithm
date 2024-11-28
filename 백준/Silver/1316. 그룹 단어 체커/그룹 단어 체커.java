import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        int groupWordCount = 0;

        // 각 단어에 대해 처리
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }
        System.out.println(groupWordCount);
    }

    // 그룹 단어인지 확인하는 함수
    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26]; // 알파벳 방문 여부
        char prev = '\0'; // 이전 문자 초기화

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            // 문자가 변경되었는데 이미 나온 적 있다면 그룹 단어가 아님
            if (current != prev) {
                if (seen[current - 'a']) {
                    return false;
                }
                seen[current - 'a'] = true; // 현재 문자를 방문 처리
            }
            prev = current; // 이전 문자 갱신
        }
        return true; // 그룹 단어임
    }
}
