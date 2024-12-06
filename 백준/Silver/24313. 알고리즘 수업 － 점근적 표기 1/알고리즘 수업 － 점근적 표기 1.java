import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 입력 받기
        int a1 = input.nextInt();
        int a0 = input.nextInt();
        int c = input.nextInt();
        int n0 = input.nextInt();

        // 조건 확인
        boolean isBigO = true;

        // n = n0부터 확인
        for (int n = n0; n <= 100; n++) {
            if ((a1 * n + a0) > (c * n)) {
                isBigO = false;
                break;
            }
        }

        // 출력
        System.out.println(isBigO ? 1 : 0);
    }
}