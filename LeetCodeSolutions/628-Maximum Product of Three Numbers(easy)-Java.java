class Solution {
    public int maximumProduct(int[] nums) {
        int res = 0;
        int n = nums.length - 1;
        Arrays.sort(nums);
        //if all are positive or all are negative
        if(nums[0] >= 0 || nums[n] < 0) res = nums[n] * nums[n-1] * nums[n-2];
        //if some are positive and some are negative
        else{
            //if only one negative
            if(nums[0] < 0 && nums[1] >= 0) res = nums[n] * nums[n-1] * nums[n-2];
            //if more than one negative
            if(nums[0] < 0 && nums[1] < 0){
                if(nums[0] * nums[1] * nums[n] > nums[n] * nums[n-1] * nums[n-2]) res = nums[0] * nums[1] * nums[n];
                else res = nums[n] * nums[n-1] * nums[n-2];
            }
        }

        return res; 
    }
}