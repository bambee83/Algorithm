import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    // 1-based index 사용을 위해 N+1 크기로 선언
    int[] arr = new int[N+1];
    int[] arr2 = new int[N+1];

    st = new StringTokenizer(br.readLine());
    for (int i = 1; i <= N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
      // 구간합 계산
      if (i == 0) {
        arr2[i] = arr[i]; // 첫 번째 값 그대로 저장
      } else {
        arr2[i] = arr2[i - 1] + arr[i]; // 이전 값 + 현재 값
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine()); // 새로운 줄을 읽어야 함
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      sb.append(arr2[b] - arr2[a - 1]).append("\n"); // 개행 포함하여 추가
    }
    System.out.print(sb); 
  }
}