import java.util.*;

public class Main {
    static boolean[] visited; // 방문 여부 배열
    static ArrayList<ArrayList<Integer>> network; // 네트워크를 그래프 형태로 저장
    
    // DFS를 이용하여 바이러스가 전파되는 컴퓨터를 탐색
    static void dfs(int computer) {
        visited[computer] = true; // 현재 컴퓨터 방문 처리
        
        // 현재 컴퓨터와 연결된 다른 컴퓨터들을 탐색
        for (int nextComputer : network.get(computer)) {
            if (!visited[nextComputer]) { // 아직 방문하지 않은 컴퓨터라면
                dfs(nextComputer); // 재귀적으로 DFS 탐색
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // 컴퓨터의 수
        int m = sc.nextInt(); // 연결된 컴퓨터 쌍의 수
        
        visited = new boolean[n + 1]; // 1번부터 n번까지 컴퓨터 번호가 있으므로 크기는 n+1
        network = new ArrayList<>();
        
        // 네트워크 초기화
        for (int i = 0; i <= n; i++) {
            network.add(new ArrayList<>());
        }
        
        // 연결 정보 입력받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            network.get(a).add(b);
            network.get(b).add(a);
        }
        
        // 1번 컴퓨터부터 DFS 탐색 시작
        dfs(1);
        
        // 1번 컴퓨터를 제외한 감염된 컴퓨터의 수를 출력
        int result = 0;
        for (int i = 2; i <= n; i++) {
            if (visited[i]) {
                result++;
            }
        }
        System.out.println(result);
    }
}