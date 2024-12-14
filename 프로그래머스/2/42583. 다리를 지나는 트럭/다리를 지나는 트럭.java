import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>(); // 다리를 나타내는 큐
        int time = 0; // 경과 시간
        int bridgeWeight = 0; // 현재 다리 위의 트럭 무게
        int index = 0; // 대기 중인 트럭의 인덱스

        // 다리의 길이만큼 0으로 채움 (초기 상태)
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        while (index < truck_weights.length || bridgeWeight > 0) {
            time++; // 1초 경과

            // 다리에서 가장 앞에 있는 트럭(또는 빈 공간) 제거
            int exitingTruck = bridge.poll();
            bridgeWeight -= exitingTruck; // 다리 무게에서 제거된 트럭 무게를 뺌

            // 새로운 트럭을 다리에 올릴 수 있는지 확인
            if (index < truck_weights.length && bridgeWeight + truck_weights[index] <= weight) {
                bridge.add(truck_weights[index]); // 다리에 트럭 추가
                bridgeWeight += truck_weights[index]; // 다리 무게에 추가
                index++; // 다음 트럭 대기열로 이동
            } else {
                bridge.add(0); // 트럭을 올릴 수 없으면 빈 공간 유지
            }
        }

        return time; // 모든 트럭이 다리를 건넌 후의 시간 반환
    }
}