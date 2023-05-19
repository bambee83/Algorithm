class Solution {
    public int solution(int a, int b) {
    String x = Integer.toString(a);
    String y = Integer.toString(b);
        
    return Integer.parseInt((x + y).compareTo(y + x) > 0 ? (x + y) : (y+ x));
    }
}