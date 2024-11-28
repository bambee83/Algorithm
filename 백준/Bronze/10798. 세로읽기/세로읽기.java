import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // 5개의 단어를 입력받아 배열에 저장
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.nextLine();
        }

        StringBuilder result = new StringBuilder();

        // 최대 15개의 글자까지 세로로 읽기
        for (int col = 0; col < 15; col++) {
            for (int row = 0; row < 5; row++) {
                // 단어의 길이보다 긴 열은 무시
                if (col < words[row].length()) {
                    result.append(words[row].charAt(col));
                }
            }
        }
        System.out.println(result);

    }
}
