import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long N = Long.parseLong(br.readLine()); // 입력값 (최대 21억까지)
        long result = (long) Math.sqrt(N); // √N의 정수 부분
        
        System.out.println(result); // 열린 창문의 개수 출력
    }
}