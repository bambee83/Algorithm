class Solution {
    public int[] solution(int n) {
        // n 이하의 홀수 개수를 구하기 위해 (n + 1) / 2
        int[] answer = new int[(n + 1) / 2];
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                /* 홀수를 배열에 할당
                 i가 1일 때 i / 2는 0이고, i가 3일 때 i / 2는 1
                  1부터 n까지의 홀수를 오름차순으로 배열에 담아 리턴
                */
                answer[i / 2] = i;
            }
        }
        return answer;
    }
}