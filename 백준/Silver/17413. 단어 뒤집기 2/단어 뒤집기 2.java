import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        String input = br.readLine();

        StringBuilder word = new StringBuilder(); // 단어를 뒤집기 위한 임시 저장 공간
        boolean insideTag = false; // 현재 태그 안에 있는지 여부를 나타내는 플래그

        for (char c : input.toCharArray()) {
            if (c == '<') {
                // 태그 시작: 이전에 쌓인 단어를 뒤집어 추가하고, 태그 시작 표시
                result.append(word.reverse());
                word.setLength(0); // 임시 저장소 초기화
                insideTag = true;
                result.append(c); // '<' 추가
            } else if (c == '>') {
                // 태그 종료: 태그 내용 추가하고 태그 종료 표시
                insideTag = false;
                result.append(c);
            } else if (insideTag) {
                // 태그 안에 있는 경우 그대로 추가
                result.append(c);
            } else {
                // 태그 밖의 경우
                if (c == ' ') {
                    // 공백을 만나면: 이전 단어를 뒤집어 결과에 추가
                    result.append(word.reverse()).append(' ');
                    word.setLength(0); // 임시 저장소 초기화
                } else {
                    // 단어 구성 중: 임시 저장소에 추가
                    word.append(c);
                }
            }
        }
        // 마지막으로 남은 단어 처리
        result.append(word.reverse());
        System.out.println(result);
    }
}