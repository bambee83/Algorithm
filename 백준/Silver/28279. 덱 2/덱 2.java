import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 명령의 수
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "1": // 1 X: 덱의 앞에 X 추가
                    deque.addFirst(Integer.parseInt(command[1]));
                    break;
                case "2": // 2 X: 덱의 뒤에 X 추가
                    deque.addLast(Integer.parseInt(command[1]));
                    break;
                case "3": // 3: 덱 앞의 정수를 제거하고 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollFirst() + "\n");
                    }
                    break;
                case "4": // 4: 덱 뒤의 정수를 제거하고 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.pollLast() + "\n");
                    }
                    break;
                case "5": // 5: 덱의 크기 출력
                    bw.write(deque.size() + "\n");
                    break;
                case "6": // 6: 덱이 비어있는지 확인
                    bw.write((deque.isEmpty() ? 1 : 0) + "\n");
                    break;
                case "7": // 7: 덱 앞의 정수를 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekFirst() + "\n");
                    }
                    break;
                case "8": // 8: 덱 뒤의 정수를 출력
                    if (deque.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(deque.peekLast() + "\n");
                    }
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}