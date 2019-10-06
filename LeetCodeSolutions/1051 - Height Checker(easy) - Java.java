class Solution {
    public int heightChecker(int[] heights) {
        int[] heights2 = new int[heights.length];
        int count = 0;
        for(int i = 0;i<heights.length;i++){ // can also use Arrays.clone();
           heights2[i] = heights[i];
        }
        
        Arrays.sort(heights2);
            
        for(int i = 0;i<heights.length;i++){
           if(heights2[i] != heights[i]) count++;
        }
        
        return count;
    }
}