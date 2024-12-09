import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        // 서로 다른 부분 문자열을 저장할 HashSet
        Set<String> uniqueSubstrings = new HashSet<>();

        // 부분 문자열 생성 및 저장
        int length = s.length();
        for (int i = 0; i < length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < length; j++) {
                sb.append(s.charAt(j));
                uniqueSubstrings.add(sb.toString());
            }
        }

        System.out.println(uniqueSubstrings.size());
    }
}