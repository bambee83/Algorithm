import java.util.HashMap;
import java.util.Map;

class Solution {
public int solution(int[] array) {
  // 최빈값의 빈도수를 저장할 Map 객체 생성
  Map<Integer, Integer> map = new HashMap<>();

  // 배열의 각 요소를 Map 객체에 추가
  for (int i = 0; i < array.length; i++) {
    map.put(array[i], map.getOrDefault(array[i], 0) + 1);
  }

  // 최빈값의 빈도수
  int maxCount = 0;

  // 최빈값
  int mode = -1;

  // Map 객체를 순회하며 최빈값을 찾는다.
  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() > maxCount) {
      maxCount = entry.getValue();
      mode = entry.getKey();
    }
  }

  // 최빈값이 여러 개면 -1을 반환한다.
  for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() == maxCount && entry.getKey() != mode) {
      return -1;
    }
  }

  return mode;
}
}