import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charArray = str.toCharArray();
            for(char c : charArray){
                  char b;
            if (Character.isUpperCase(c)) { 
                b = Character.toLowerCase(c);
            } else {
                b = Character.toUpperCase(c);
            }
            System.out.print(b);
        }
        sc.close();
    }
}