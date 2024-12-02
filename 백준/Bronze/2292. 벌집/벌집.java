import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        if (N == 1) {
            System.out.println(1); 
            return;
        }

        long roomCount = 1; // 1번 방 포함
        int layers = 1; // 현재 층 번호

        // N번 방이 포함된 층을 찾는다
        while (roomCount < N) {
            roomCount += 6L * layers; // 각 층에서 추가되는 방의 수
            layers++;
        }

        System.out.println(layers);


    }
}
