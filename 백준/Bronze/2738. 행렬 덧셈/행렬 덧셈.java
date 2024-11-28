import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] matrixA = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        int[][] matrixB = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        int[][] resultMatrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(resultMatrix[i][j] + " "); // 같은 줄에 출력
            }
            System.out.println(); // 행이 끝나면 줄바꿈
        }
        
    }
}
