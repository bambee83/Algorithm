import java.util.*;

class Solution {

    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {priorities[i], i}); // {우선순위, 위치}
        }
        int order = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 큐에서 프로세스 꺼내기
            boolean hasHigherPriority = false;

            // 나머지 큐에 더 높은 우선순위가 있는지 확인
            for (int[] process : queue) {
                if (process[0] > current[0]) { // 우선순위 비교
                    hasHigherPriority = true;
                    break;
                }
            }

            // 더 높은 우선순위가 있는 경우 다시 큐에 넣기
            if (hasHigherPriority) {
                queue.add(current);
            } else {
                // 현재 프로세스를 실행
                order++;
                if (current[1] == location) { // 찾고자 하는 프로세스인지 확인
                    return order;
                }
            }
        }
        return -1; // 이론상 여기 도달할 일은 없음
    }
}