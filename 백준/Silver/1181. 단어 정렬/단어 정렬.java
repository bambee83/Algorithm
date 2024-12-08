import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        // 중복 제거를 위해 Set 사용
        Set<String> wordSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            wordSet.add(br.readLine());
        }

        // Set을 List로 변환
        List<String> wordList = new ArrayList<>(wordSet);

        // 정렬: 길이 우선, 길이가 같으면 사전순
        Collections.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return Integer.compare(a.length(), b.length()); // 길이 기준 정렬
                }
                return a.compareTo(b); // 사전순 정렬
            }
        });
        for (String word : wordList) {
            bw.write(word + "\n");
        }
        bw.flush();
        bw.close();
    }
}