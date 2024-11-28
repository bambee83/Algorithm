import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] requiredPieces = {1, 1, 2, 2, 2, 8};
        // 입력받은 현재 흰색 체스 피스 개수
        int[] currentPieces = new int[6];
        for (int i = 0; i < 6; i++) {
            currentPieces[i] = scanner.nextInt();
        }
        // 필요한 조정값 계산 및 출력
        for (int i = 0; i < 6; i++) {
            System.out.print((requiredPieces[i] - currentPieces[i]) + " ");
        }
    }
}
