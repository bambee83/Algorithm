import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // 삼각형 종류 판단
        if (a == 60 && b == 60 && c == 60) {
            System.out.println("Equilateral");
        } else if (a + b + c == 180) {
            if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}