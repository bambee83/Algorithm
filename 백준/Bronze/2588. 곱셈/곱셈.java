import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 생성
        Scanner sc = new Scanner(System.in);

        // 첫 번째 세 자리 자연수 입력받기
        int num1 = sc.nextInt();
        // 두 번째 세 자리 자연수 입력받기
        int num2 = sc.nextInt();

        // (3) 두 번째 숫자의 1의 자리와 첫 번째 숫자를 곱한 값
        System.out.println(num1 * (num2 % 10));
        // (4) 두 번째 숫자의 10의 자리와 첫 번째 숫자를 곱한 값
        System.out.println(num1 * ((num2 / 10) % 10));
        // (5) 두 번째 숫자의 100의 자리와 첫 번째 숫자를 곱한 값
        System.out.println(num1 * (num2 / 100));
        // (6) 두 숫자의 곱
        System.out.println(num1 * num2);

        // Scanner 닫기
        sc.close();
    }
}