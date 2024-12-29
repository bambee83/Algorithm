import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int result = 0;

        if (N == 1) {
            // Case 1: N = 1
            result = 1;
        } else if (N == 2) {
            // Case 2: N = 2
            result = Math.min(4, (M + 1) / 2);
        } else {
            // Case 3: N >= 3
            if (M < 7) {
                result = Math.min(4, M);
            } else {
                result = M - 2;
            }
        }

        System.out.println(result);
    }
}