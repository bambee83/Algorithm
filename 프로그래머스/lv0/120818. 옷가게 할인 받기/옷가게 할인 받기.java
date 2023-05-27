class Solution {
    public int solution(int price) {
      double answer = price;
        if (price >= 100_000 && price < 300_000) {
            answer = answer * 0.95;
        } else if (price >= 300_000 && price < 500_000) {
            answer = answer * 0.90;
        } else if (price >= 500_000) {
            answer = answer * 0.80;
        }
        return (int) answer;
    }
}