class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0, y = 0;
        int boardX = board[0] / 2, boardY = board[1] / 2;

        for(String key : keyinput) {
            switch (key) {
                case "up":
                    if(y < boardY) y++;
                    break;
                case "down":
                    if(y > -boardY) y--;
                    break;
                case "left":
                    if(x > -boardX) x--;
                    break;
                case "right":
                    if(x < boardX) x++;
                    break;
            }
        }

        return new int[] {x, y};
    }
}