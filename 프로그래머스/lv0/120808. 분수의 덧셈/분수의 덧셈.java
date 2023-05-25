class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
         int[] answer = new int[2];
        
        int commonDenom = denom1 * denom2; // 두 분수의 공통 분모
        int sumNumer = numer1 * denom2 + numer2 * denom1; // 분수들의 분자 합
        
        int gcd = getGCD(sumNumer, commonDenom); // 분자와 분모의 최대공약수 구하기
        answer[0] = sumNumer / gcd; // 기약 분수로 만든 분자
        answer[1] = commonDenom / gcd; // 기약 분수로 만든 분모
        
        return answer;
    }
    
    // 최대공약수를 구하는 유클리드 호제법 메서드
    public int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}