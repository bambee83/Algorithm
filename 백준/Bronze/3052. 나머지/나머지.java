import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remainders = new HashSet<>(); // 나머지를 저장할 HashSet

        // 10개의 숫자 입력
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            remainders.add(num % 42); // 42로 나눈 나머지를 HashSet에 추가
        }

        // HashSet의 크기가 서로 다른 나머지 값의 개수
        System.out.println(remainders.size());
    }
}
