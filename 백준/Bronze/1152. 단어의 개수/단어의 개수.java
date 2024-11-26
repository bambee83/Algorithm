import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim(); // 입력받고 양끝 공백 제거

        if (input.isEmpty()) {
            // 입력이 공백만으로 이루어진 경우
            System.out.println(0);
        } else {
            // 공백을 기준으로 단어 나누기
            String[] words = input.split(" ");
            System.out.println(words.length);
        }
    }
}
