import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    StringBuilder sb = new StringBuilder();

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[][] arr = new int[N + 1][N + 1]; // 1-based index
    int[][] prefixSum = new int[N + 1][N + 1]; // 누적합 배열

    // 2차원 배열 입력 및 누적합 계산
    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= N; j++) {
        arr[i][j] = Integer.parseInt(st.nextToken());
        // 누적합 공식: 현재 위치 값 + 왼쪽 + 위쪽 - 중복된 왼쪽위 값
        prefixSum[i][j] = arr[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
      }
    }

    // M개의 구간합 쿼리 처리
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());

      // 구간합 계산
      int result = prefixSum[x2][y2] - prefixSum[x1 - 1][y2] - prefixSum[x2][y1 - 1] + prefixSum[x1 - 1][y1 - 1];
      sb.append(result).append("\n");
    }

    // 결과 한 번에 출력
    System.out.print(sb);
  }
}