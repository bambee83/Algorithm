import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> cardCount = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        // 질문에 대한 답 구하기
        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(st.nextToken());
            sb.append(cardCount.getOrDefault(query, 0)).append(" ");
        }
        bw.write(sb.toString().trim());

        bw.flush();
        bw.close();
    }
}