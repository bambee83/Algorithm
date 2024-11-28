import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        // 크로아티아 알파벳을 하나의 문자로 치환
        for (String alphabet : croatiaAlphabets) {
            word = word.replace(alphabet, "!");
        }
        System.out.println(word.length());

    }
}
