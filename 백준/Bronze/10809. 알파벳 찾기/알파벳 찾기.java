import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        StringBuilder result = new StringBuilder();

       /* 'a' 부터 'z' 까지 반복
          S.indexOf(c):
		  c가 S에 포함되어 있으면 첫 등장 위치를 반환
		  포함되어 있지 않으면 -1을 반환*/
        for (char c = 'a'; c <= 'z'; c++) {
            result.append(S.indexOf(c)).append(" ");
        }

//        마지막 공백을 제거한 뒤 출력
        System.out.println(result.toString().trim());

    }
}
