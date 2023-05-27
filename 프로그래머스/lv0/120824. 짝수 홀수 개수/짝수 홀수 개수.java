class Solution {
    public int[] solution(int[] num_list) {
    int a = 0; // 짝수의 개수
    int b = 0; // 홀수의 개수

    for (int num : num_list) {
        if (num % 2 == 0) {
            a++;
        } else {
            b++;
        }
    }
    return new int[] {a, b};
    }
}