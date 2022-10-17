class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b) -> a[0] - b[0]);
        int res = -1;
        for(int i = 1; i < points.length - 1; i++) {
            res = Math.max(points[i][0]-points[i-1][0],res);
        }
        
        return res;
    }
}