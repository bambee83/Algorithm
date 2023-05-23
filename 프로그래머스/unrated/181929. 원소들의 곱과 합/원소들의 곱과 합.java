public class Solution {
    public int solution(int[] num_list) {
        int sum = sumOfSquares(num_list);
        int multiple = productOfElements(num_list);
        return sum > multiple ? 1 : 0;
    }

    public int sumOfSquares(int[] num_list) {
        int sum = 0;
        for (int num : num_list) {
            sum += num;
        }
        return sum * sum;
    }

    public int productOfElements(int[] num_list) {
        int multiple = 1;
        for (int num : num_list) {
            multiple *= num;
        }
        return multiple;
    }
}