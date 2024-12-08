import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력/출력을 위한 BufferedReader와 BufferedWriter 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[][] points = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken()); // x좌표
            points[i][1] = Integer.parseInt(st.nextToken()); // y좌표
        }

        // 정렬: x좌표 우선, y좌표 차순
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]); // x좌표 기준 오름차순
            }
            return Integer.compare(a[1], b[1]); // y좌표 기준 오름차순 x = 1인 두 점 [1, 1], [1, -1]에서 y 좌표를 기준으로 정렬
        });

        // 결과 출력
        for (int[] point : points) {
            bw.write(point[0] + " " + point[1] + "\n");
        }

        // 출력 스트림 닫기
        bw.flush();
        bw.close();
    }
}