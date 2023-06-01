class Solution {
    public long solution(int balls, int share) {
        long[][] comb = new long[balls+1][balls+1];

        for(int i=0; i<=balls; i++) {
            // i개의 구슬 중에서 0개를 선택하는 경우의 수는 항상 1가지
            comb[i][0] = 1;
            for(int j=1; j<=i; j++) {
                // i개의 구슬 중에서 j개를 선택하는 방법은 크게 두 가지 :
                // 특정 구슬 하나를 선택하고, 나머지 i-1개의 구슬 중에서 j-1개를 선택하는 방법 comb[i-1][j-1]
                // 특정 구슬 하나를 선택하지 않고, 나머지 i-1개의 구슬 중에서 j개를 선택하는 방법 comb[i-1][j]
                comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
            }
        }
        // balls개의 구슬 중에서 share개를 선택하는 모든 경우의 수를 반환
        return comb[balls][share];
    }
}
