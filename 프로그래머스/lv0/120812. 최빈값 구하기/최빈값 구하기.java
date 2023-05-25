class Solution {
    public int solution(int[] array) {
        int answer = -1;
        /* num 배열은 배열 array의 각 요소의 빈도를 저장합니다.
        1000은 배열 array의 최대값을 고려하여 구했습니다. */
        int[] num = new int[1000];
        /* array 배열의 각 요소를 num 배열의 인덱스 array[i]에 저장합니다. 
         예를 들어, array 배열의 첫 번째 요소가 1이면 num 배열의 인덱스1에 1을 저장합니다. */
        for(int i = 0; i < array.length; i++) {
            num[array[i]]++;
        }
        // max 변수는 num 배열의 최대값을 저장합니다. 처음에는 0으로 초기화합니다.
        int max = 0;
        /* num 배열의 각 요소를 순회하며, max 변수의 값과 비교합니다. 
        num[i]의 값이 max 변수의 값보다 크면 max 변수의 값을 num[i]로 바꾸고,
        answer 변수의 값을 i로 바꿉니다. 
        num[i]의 값이 max 변수의 값과 같으면 answer 변수의 값을 -1로 바꿉니다.*/
        for(int i = 0; i < 1000; i++){
            if(num[i] > max) {
                max = num[i];
                answer = i ;
            }
            else if(num[i] == max){
                answer = -1;
            }
        }
        return answer;
    }
}
