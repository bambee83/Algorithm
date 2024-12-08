import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] B = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            B[i] = scanner.nextInt();
        }
        Arrays.sort(B);
        for (int i : B) {
            sum += i;
        }
        System.out.println(sum / 5);
        System.out.println(B[2]);


    }
}