class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] danger = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    for(int dx = -1; dx <= 1; dx++) {
                        for(int dy = -1; dy <= 1; dy++) {
                            int nx = i + dx;
                            int ny = j + dy;
                            if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
                                danger[nx][ny] = true;
                            }
                        }
                    }
                }
            }
        }
        
        int safeArea = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!danger[i][j]) safeArea++;
            }
        }

        return safeArea;
    }
}
