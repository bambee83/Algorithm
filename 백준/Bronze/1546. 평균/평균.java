import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] original = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++) {
      original[i] = Integer.parseInt(st.nextToken());
    }
    int max = original[0];
    for (int i = 1; i < n; i++) {
      if (max < original[i]) {
        max = original[i];
      }
    }
    double sum = 0;
    for (int i = 0; i < n; i++) {
      sum += (double) original[i] /max*100;
    }
    System.out.println(sum/n);
  }
}