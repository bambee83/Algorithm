import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder  sb = new StringBuilder();

        int testCaseCount = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < testCaseCount; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // 목표 문서의 위치

            st = new StringTokenizer(br.readLine());
            Queue<Document> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 (내림차순)

            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.add(new Document(i, priority)); // 문서 추가
                priorityQueue.add(priority); // 중요도를 우선순위 큐에 추가
            }

            int printOrder = 0; // 출력 순서

            while (!queue.isEmpty()) {
                Document current = queue.poll(); // 큐에서 문서를 꺼냄

                // 현재 문서가 우선순위 큐에서 가장 높은 중요도와 일치하는지 확인
                if (current.priority == priorityQueue.peek()) {
                    printOrder++; // 출력 순서를 증가
                    priorityQueue.poll(); // 우선순위 큐에서 가장 높은 중요도를 제거

                    if (current.index == M) { // 목표 문서인지 확인
                        sb.append(printOrder).append("\n");
                        break;
                    }
                } else {
                    // 중요도가 낮으면 문서를 큐의 맨 뒤로 이동
                    queue.add(current);
                }
            }
        }
        System.out.print(sb);
    }
}

// 문서 정보를 저장할 클래스
class Document {
    int index; // 문서의 원래 위치
    int priority; // 문서의 중요도

    Document(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}