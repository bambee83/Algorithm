class Solution {
    public int solution(int[][] dots) {
        int x_min = dots[0][0], x_max = dots[0][0];
        int y_min = dots[0][1], y_max = dots[0][1];
        
        for(int i=1; i<dots.length; i++){
            if(dots[i][0] < x_min) x_min = dots[i][0];
            if(dots[i][0] > x_max) x_max = dots[i][0];
            if(dots[i][1] < y_min) y_min = dots[i][1];
            if(dots[i][1] > y_max) y_max = dots[i][1];
        }
        
        int width = x_max - x_min;
        int height = y_max - y_min;
        
        return width * height;
    }
}