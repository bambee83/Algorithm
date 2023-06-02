class Solution {
    public int[][] solution(int[] num_list, int n) {
        int size = num_list.length;
        int[][] answer = new int[size/n][n];
        for (int i = 0; i< size; i++) {
            // 2차원 배열의 행 인덱스는 i/n으로, 열 인덱스는 i%n으로 계산
            answer[i/n][i%n]=num_list[i];
        }
        return answer;
    }
}