import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        char[] charArray = N.toCharArray();
        Integer[] numbers = new Integer[charArray.length];

        boolean yesTen = false;
        int sum = 0;
        for (int i = 0; i < charArray.length; i++) {
            numbers[i] = charArray[i] - '0';
            sum += numbers[i];
            if (numbers[i] == 0) yesTen = true;
        }

        if (sum % 3 != 0 || !yesTen) {
            System.out.println(-1);
            System.exit(0);
        } else {
            Arrays.sort(numbers, Collections.reverseOrder());
            for (int n : numbers) {
                System.out.print(n);
            }
        }
        br.close();
    }
}