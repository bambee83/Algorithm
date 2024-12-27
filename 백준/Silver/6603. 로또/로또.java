import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String line = br.readLine();
            if (line.equals("0")) break;


            String[] parts = line.split(" ");
            int k = Integer.parseInt(parts[0]);
            int[] numbers = new int[k];
            for (int i = 0; i < k; i++) {
                numbers[i] = Integer.parseInt(parts[i + 1]);
            }

            // 조합 계산
            List<int[]> combinations = new ArrayList<>();
            generateCombinations(numbers, new int[6], 0, 0, combinations);

            // 출력 저장
            for (int[] combination : combinations) {
                for (int num : combination) {
                    sb.append(num).append(" ");
                }
                sb.setLength(sb.length() - 1); // 마지막 공백 제거
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
        }
    // 조합 생성
    static void generateCombinations(int[] numbers, int[] temp, int depth, int start, List<int[]> combinations) {
        if (depth == 6) {
            combinations.add(temp.clone()); // 6개를 선택했으면 결과 저장
            return;
        }

        for (int i = start; i < numbers.length; i++) {
            temp[depth] = numbers[i];
            generateCombinations(numbers, temp, depth + 1, i + 1, combinations);
        }
    }
}