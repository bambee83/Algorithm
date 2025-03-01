import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      int a = Integer.parseInt(br.readLine());
      arr[i] = a;
    }
    Arrays.sort(arr);
    for (int i : arr) {
      System.out.println(i);
    }
  }
}