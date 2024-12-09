import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 첫 줄 입력: 집합 A와 B의 원소 개수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSize = Integer.parseInt(st.nextToken());
        int bSize = Integer.parseInt(st.nextToken());

        // 집합 A 입력
        Set<Integer> setA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < aSize; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }

        // 집합 B 입력
        Set<Integer> setB = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < bSize; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }

        // 대칭 차집합 크기 계산
        int symmetricDifferenceSize = 0;

        // (A - B)
        for (int num : setA) {
            if (!setB.contains(num)) {
                symmetricDifferenceSize++;
            }
        }

        // (B - A)
        for (int num : setB) {
            if (!setA.contains(num)) {
                symmetricDifferenceSize++;
            }
        }

        bw.write(symmetricDifferenceSize + "\n");
        bw.flush();
        bw.close();
    }
}