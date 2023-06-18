import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        int prod1 = numbers[0] * numbers[1]; // 최소 두 숫자의 곱
        int prod2 = numbers[len-1] * numbers[len-2]; // 최대 두 숫자의 곱
        return Math.max(prod1, prod2); // 둘 중 더 큰 값 반환
    }
}