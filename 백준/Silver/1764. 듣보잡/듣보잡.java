import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // 듣도 못한 사람의 명단을 저장할 HashSet
        Set<String> unheardSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unheardSet.add(br.readLine());
        }

        // 듣보잡 명단을 저장할 List
        List<String> unheardAndUnseen = new ArrayList<>();
        // 보도 못한 사람 입력 및 교집합 찾기
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (unheardSet.contains(name)) {
                unheardAndUnseen.add(name);
            }
        }
        Collections.sort(unheardAndUnseen);
        bw.write(unheardAndUnseen.size() + "\n");
        for (String name : unheardAndUnseen) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
    }
}