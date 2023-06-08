class Solution {
    public int solution(int[] numbers, int k) {
        int currentIndex = 0;  // 첫 번째 사람이 시작합니다.
        for (int i = 0; i < k-1; i++) {  // k-1 번 반복합니다.
            currentIndex += 2;  // 오른쪽으로 두 명을 건너뜁니다.
            if (currentIndex >= numbers.length) {  // 배열의 끝을 넘어갈 경우
                currentIndex -= numbers.length;  // 배열의 길이를 빼줍니다.
            }
        }
        return numbers[currentIndex];  // k 번째로 공을 던지는 사람의 번호를 반환합니다.
    }
}
