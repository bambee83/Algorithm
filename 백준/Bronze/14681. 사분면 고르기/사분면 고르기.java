import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > 0 && B > 0) {
            System.out.println("1"); // 제1사분면
        } else if (A < 0 && B > 0) {
            System.out.println("2"); // 제2사분면
        } else if (A < 0 && B < 0) {
            System.out.println("3"); // 제3사분면
        } else {
            System.out.println("4"); // 제4사분면
        }

    }
}