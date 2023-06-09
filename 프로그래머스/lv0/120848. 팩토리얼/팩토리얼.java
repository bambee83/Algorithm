class Solution {
    public int solution(int n) {
        long factorial = 1;
        int i;
        for (i = 1; i <= n; i++) {
            factorial *= i;
            if (factorial > n) {
                break;
            }
        }
        return i - 1;
    }
}
