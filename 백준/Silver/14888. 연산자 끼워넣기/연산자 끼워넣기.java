import java.util.*;

public class Main {

    static int N;
    static int[] numbers;
    static int[] operators = new int[4];  // 덧셈, 뺄셈, 곱셈, 나눗셈의 개수
    static int maxResult = Integer.MIN_VALUE;
    static int minResult = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 수의 개수 N
        N = sc.nextInt();
        numbers = new int[N];
        
        // 수열 A1, A2, ..., AN
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // 연산자 개수 (덧셈, 뺄셈, 곱셈, 나눗셈)
        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        // 가능한 모든 연산자 배열 만들기
        List<Integer> operatorList = new ArrayList<>();
        for (int i = 0; i < operators[0]; i++) operatorList.add(0);  // 덧셈
        for (int i = 0; i < operators[1]; i++) operatorList.add(1);  // 뺄셈
        for (int i = 0; i < operators[2]; i++) operatorList.add(2);  // 곱셈
        for (int i = 0; i < operators[3]; i++) operatorList.add(3);  // 나눗셈

        // 연산자 배열을 순열로 탐색
        permute(operatorList, 0);
        
        // 결과 출력
        System.out.println(maxResult);
        System.out.println(minResult);
    }

    // 연산자 배열을 이용해 가능한 모든 계산 수행
    public static void permute(List<Integer> operatorList, int start) {
        if (start == operatorList.size()) {
            // 계산 수행
            int result = numbers[0];
            int idx = 1;
            
            for (int i = 0; i < operatorList.size(); i++) {
                int operator = operatorList.get(i);
                int num = numbers[idx++];
                
                if (operator == 0) { // 덧셈
                    result += num;
                } else if (operator == 1) { // 뺄셈
                    result -= num;
                } else if (operator == 2) { // 곱셈
                    result *= num;
                } else if (operator == 3) { // 나눗셈
                    if (result < 0) {
                        result = -(-result / num);  // 음수 나눗셈 처리
                    } else {
                        result /= num;
                    }
                }
            }

            // 최댓값, 최솟값 갱신
            maxResult = Math.max(maxResult, result);
            minResult = Math.min(minResult, result);
            return;
        }
        
        for (int i = start; i < operatorList.size(); i++) {
            Collections.swap(operatorList, i, start);  // 위치 변경
            permute(operatorList, start + 1);  // 다음 위치로 재귀 호출
            Collections.swap(operatorList, i, start);  // 원상 복구
        }
    }
}