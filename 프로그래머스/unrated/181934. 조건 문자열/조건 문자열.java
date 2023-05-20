class Solution {
    public int solution(String ineq, String eq, int n, int m) {
     String condition = ineq + eq;
        switch (condition) {
            case ">=":
                if (n >= m) return 1;
                break;
            case "<=":
                if (n <= m) return 1;
                break;
            case ">!":
                if (n > m) return 1;
                break;
            case "<!":
                if (n < m) return 1;
                break;
        }
        return 0;
    }
}