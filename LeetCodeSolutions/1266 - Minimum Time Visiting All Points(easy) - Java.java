class Solution {
    int seconds = 0;
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i = 0, j = 1; i < points.length && j < points.length; i++, j++) {
            
            int x1 = points[i][0];
            int y1 = points[i][1];
            
            int x2 = points[j][0];
            int y2 = points[j][1];
            
            int xLength = x2 - x1;
            int yLength = y2 - y1;
            
            if(xLength < 0) xLength *= -1;
            if(yLength < 0) yLength *= -1;
            
            if(xLength > yLength) {
                sum += xLength;
            } else {
                sum += yLength;
            }
        }
        return sum;
    }
    
})