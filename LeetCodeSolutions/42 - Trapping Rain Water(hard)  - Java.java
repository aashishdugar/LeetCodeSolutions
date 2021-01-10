class Solution {
    public int trap(int[] height) {
        int[] lArray = new int[height.length];
        int[] rArray = new int[height.length];
        int[] water = new int[height.length];
        int res = 0;
        
        if(height.length <= 1) return 0;
        
        lArray[0] = height[0];
        rArray[height.length - 1] = height[height.length - 1];
        
        for(int i = 1; i  < height.length; i++){
            lArray[i] = Math.max(height[i],lArray[i-1]);
        }
        
        
        for(int i = height.length - 2; i >= 0; i--){
            rArray[i] = Math.max(height[i],rArray[i + 1]);
        }
        
        for(int i = 0; i < height.length; i++){
            water[i] = Math.min(lArray[i],rArray[i]) - height[i];
        }
        
        for(int x: water) {
            res += x;
        } 
        
        return res;
    }
}