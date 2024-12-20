import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] inputN = br.readLine().split(" ");
        HashMap<Integer, Integer> cardMap = new HashMap<>();
        for (String s : inputN) {
            int num = Integer.parseInt(s);
            cardMap.put(num, cardMap.getOrDefault(num, 0) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        String[] inputM = br.readLine().split(" ");
        for (String s : inputM) {
            int num = Integer.parseInt(s);
            if (cardMap.containsKey(num)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
