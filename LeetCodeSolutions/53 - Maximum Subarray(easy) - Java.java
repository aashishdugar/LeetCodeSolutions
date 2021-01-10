class Solution {
    public int maxSubArray(int[] nums) {
        //Initalize variables
        int currSum = nums[0];
        int maxSum = nums[0];
        
        //for array with 1 element
        if(nums.length == 1) return nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            if (currSum >= 0) {
                currSum += nums[i];
            }
            else currSum = nums[i];
                
            if(currSum > maxSum) maxSum = currSum;    
        }
        
        return maxSum;
    }
}

