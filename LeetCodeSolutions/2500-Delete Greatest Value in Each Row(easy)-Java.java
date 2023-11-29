class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int maxElem = -1;
        int ind = 1;
        boolean loop = true;
        for(int[] x : grid){
            Arrays.sort(x);
        }
        while(loop){
            if(grid[0].length - ind < 0) {
                loop = false;
                break;
            }
            for(int i = 0; i < grid.length; i++){
                if(grid[i].length == 0) break;
                maxElem = Math.max(maxElem, grid[i][grid[i].length - ind]);
            }
            System.out.println(ind+","+maxElem);
            sum+=maxElem;
            ind++;
            maxElem = -1;
        }

        return sum;
    }
}