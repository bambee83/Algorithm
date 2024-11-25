import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] submitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int N = sc.nextInt();
            submitted[N] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) { 
                System.out.println(i);
            }

        }
    }
}
