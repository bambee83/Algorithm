import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int []  arr = new int[N];
    int [] res = new int[N];

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < N; i++) {
      // 스택이 비어있지 않고, 현재 수가 스택의 top이 가리키는 인덱스 값보다 클 경우
      while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
        res[stack.pop()] = arr[i]; // 현재 값이 오큰수이므로 결과 배열에 저장
      }
      stack.push(i); // 인덱스를 스택에 저장
    }

    // 스택에 남아 있는 인덱스는 오큰수가 없는 경우이므로 -1로 처리
    while (!stack.isEmpty()) {
      res[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();
    for (int re : res) {
      sb.append(re).append(" ");
    }
    System.out.println(sb);
    
  }
}