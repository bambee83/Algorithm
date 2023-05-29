class Solution {
    public int solution(int n) {
          int count = 0;
    
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            count *= 2;
            if (Math.pow((int)Math.sqrt(n), 2) == n) {
                count--;
            }

            return count;
    }
}