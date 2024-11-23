import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // 현재 시간 입력받기
        int H = sc.nextInt(); // 시간
        int M = sc.nextInt(); // 분

        // 45분 앞당기기
        M -= 45;

        // 만약 분(M)이 음수라면
        if (M < 0) {
            M += 60; // 60분을 더해서 양수로 만듦
            H -= 1; // 한 시간을 빼줌
        }

        // 만약 시간이 음수라면
        if (H < 0) {
            H += 24; // 24를 더해서 하루의 끝으로 되돌림
        }

        // 결과 출력
        System.out.println(H + " " + M);

    }
}