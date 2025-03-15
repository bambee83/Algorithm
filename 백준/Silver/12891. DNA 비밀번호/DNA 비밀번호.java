import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  static int[] checkArr;
  static int[] myArr;
  static int checkSecret; // 조건을 만족하는 문자의 개수

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int S = Integer.parseInt(st.nextToken()); // DNA 문자열 길이
    int P = Integer.parseInt(st.nextToken()); // 부분문자열 길이

    char[] A = br.readLine().toCharArray(); // DNA 문자열 입력

    checkArr = new int[4]; // A, C, G, T의 최소 개수 저장 배열
    myArr = new int[4]; // 현재 상태에서의 A, C, G, T의 개수 저장 배열
    checkSecret = 0;

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < 4; i++) {
      checkArr[i] = Integer.parseInt(st.nextToken());
      if (checkArr[i] == 0) checkSecret++;
    }

    int result = 0;

    // 초기 P만큼 부분 문자열 처리
    for (int i = 0; i < P; i++) {
      add(A[i]);
    }
    if (checkSecret == 4) result++;

    // 슬라이딩 윈도우 처리
    for (int i = P; i < S; i++) {
      int j = i - P;
      add(A[i]);
      remove(A[j]);
      if (checkSecret == 4) result++;
    }

    System.out.println(result);
    br.close();
  }

  // 새로 들어온 문자를 처리하는 함수
  private static void add(char c) {
    switch (c) {
      case 'A':
        myArr[0]++;
        if (myArr[0] == checkArr[0]) checkSecret++;
        break;
      case 'C':
        myArr[1]++;
        if (myArr[1] == checkArr[1]) checkSecret++;
        break;
      case 'G':
        myArr[2]++;
        if (myArr[2] == checkArr[2]) checkSecret++;
        break;
      case 'T':
        myArr[3]++;
        if (myArr[3] == checkArr[3]) checkSecret++;
        break;
    }
  }

  // 제거되는 문자를 처리하는 함수
  private static void remove(char c) {
    switch (c) {
      case 'A':
        if (myArr[0] == checkArr[0]) checkSecret--;
        myArr[0]--;
        break;
      case 'C':
        if (myArr[1] == checkArr[1]) checkSecret--;
        myArr[1]--;
        break;
      case 'G':
        if (myArr[2] == checkArr[2]) checkSecret--;
        myArr[2]--;
        break;
      case 'T':
        if (myArr[3] == checkArr[3]) checkSecret--;
        myArr[3]--;
        break;
    }
  }
}
