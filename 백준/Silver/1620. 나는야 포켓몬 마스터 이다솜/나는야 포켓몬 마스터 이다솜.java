import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 번호 → 이름 매핑
        Map<Integer, String> numberToName = new HashMap<>();
        // 이름 → 번호 매핑
        Map<String, Integer> nameToNumber = new HashMap<>();

        // N개의 포켓몬 이름 입력
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            numberToName.put(i, name);
            nameToNumber.put(name, i);
        }

        // M개의 문제 입력 및 처리
        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (Character.isDigit(query.charAt(0))) {
                // 숫자인 경우: 번호로 이름 찾기
                int num = Integer.parseInt(query);
                bw.write(numberToName.get(num) + "\n");
            } else {
                // 문자인 경우: 이름으로 번호 찾기
                bw.write(nameToNumber.get(query) + "\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}