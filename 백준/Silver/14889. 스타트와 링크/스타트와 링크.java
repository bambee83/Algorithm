import java.util.*;

public class Main {
    static int N;
    static int[][] S;
    static boolean[] visited;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N 입력
        N = sc.nextInt();
        S = new int[N][N];
        
        // 능력치 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                S[i][j] = sc.nextInt();
            }
        }

        visited = new boolean[N];
        divideTeams(0, 0);

        System.out.println(minDifference);
    }

    // 팀을 나누는 함수
    static void divideTeams(int startIdx, int count) {
        if (count == N / 2) {
            // 두 팀이 모두 완성되었으면 능력치 차이를 계산
            calculateDifference();
            return;
        }

        for (int i = startIdx; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                divideTeams(i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    // 능력치 차이를 계산하는 함수
    static void calculateDifference() {
        int startTeam = 0;
        int linkTeam = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visited[i] && visited[j]) {
                    startTeam += S[i][j] + S[j][i];
                } else if (!visited[i] && !visited[j]) {
                    linkTeam += S[i][j] + S[j][i];
                }
            }
        }

        minDifference = Math.min(minDifference, Math.abs(startTeam - linkTeam));
    }
}