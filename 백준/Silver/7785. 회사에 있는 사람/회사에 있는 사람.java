import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Set<String> company = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")) {
                company.add(name); // 출근: 이름 추가
            } else if (action.equals("leave")) {
                company.remove(name); // 퇴근: 이름 제거
            }
        }
        
        // 회사에 남아있는 사람들을 List로 변환 및 정렬
        List<String> result = new ArrayList<>(company);
        result.sort(Collections.reverseOrder()); // 사전 순 역순 정렬

        for (String name : result) {
            bw.write(name + "\n");
        }

        bw.flush();
        bw.close();
    }
}