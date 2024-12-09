import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 상근이가 가진 숫자 카드 입력
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> cardSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }
        
        // 확인할 숫자 카드 입력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int query = Integer.parseInt(st.nextToken());
            if (cardSet.contains(query)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
    }
}