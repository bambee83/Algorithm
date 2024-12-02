import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();

        int length = (int) Math.pow(2, N) + 1;

        System.out.println(length * length);


    }
}
