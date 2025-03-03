import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    int[] count = new int[M]; // 나머지 카운팅 배열
    long prefixSum = 0; // 누적합
    long result = 0; // 정답 개수

    st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      prefixSum += Integer.parseInt(st.nextToken());
      int remainder = (int) (prefixSum % M);
      if (remainder < 0) remainder += M;
      if (remainder == 0) result++;
      result += count[remainder];
      count[remainder]++;
    }

    System.out.println(result);
  }
}