import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
      // 복사 배열 생성
        int[] sortedEmergency = Arrays.copyOf(emergency, emergency.length);

        // 복사 배열을 내림차순으로 정렬
        Arrays.sort(sortedEmergency);

        // 결과 배열 생성
        int[] result = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sortedEmergency.length; j++) {
                // 원본 배열의 요소가 복사 배열에서 어디에 있는지 찾아 결과 배열에 넣는다.
                // 이때, 응급도가 높은 순서대로 낮은 인덱스 값을 부여한다.
                if (emergency[i] == sortedEmergency[j]) {
                    result[i] = sortedEmergency.length - j;
                }
            }
        }

        return result;
    }
}