class Solution {
    public long solution(int balls, int share) {
        long[][] comb = new long[balls+1][balls+1];

        for(int i=0; i<=balls; i++) {
            comb[i][0] = 1;
            for(int j=1; j<=i; j++) {
                comb[i][j] = comb[i-1][j-1] + comb[i-1][j];
            }
        }

        return comb[balls][share];
    }
}
