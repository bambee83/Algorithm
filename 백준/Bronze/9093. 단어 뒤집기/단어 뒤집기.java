import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] words = br.readLine().split(" "); // 문장을 공백으로 나눔
            for (String word : words) {
                // 각 단어를 뒤집어서 결과에 추가
                sb.append(new StringBuilder(word).reverse()).append(" ");
            }
            sb.append("\n"); // 한 문장이 끝난 뒤 줄바꿈 추가
        }

        System.out.print(sb);
    }
}