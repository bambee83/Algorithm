class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            int cnt = 2; // 1과 자신을 약수로 가질 것이므로 초기 카운트를 2로 설정
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    if (j * j == i) cnt++; // 제곱근이 약수인 경우
                    else cnt += 2; // 그 외의 경우, 약수가 쌍을 이루므로 2를 증가
                }
            }
            if (cnt > 2) answer++;
        }
        return answer;
    }
}
