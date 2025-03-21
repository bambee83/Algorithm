import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        
        // 카드 번호를 1부터 N까지로 설정
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        // 카드가 한 장 남을 때까지 반복
        while (q.size() > 1) {
            q.poll();             // 제일 위의 카드를 버림
            q.add(q.poll());      // 다음 카드를 맨 아래로 이동
        }

        // 마지막으로 남은 카드 출력
        System.out.println(q.poll());
    }
}