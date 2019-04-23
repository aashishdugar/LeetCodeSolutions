class Solution {
    public int maxProduct(int[] nums) {
        int max_elem = nums[0];
        for(int i = 1;i < nums.length;i++){
            int temp = nums[i];
            if(nums[i]>max_elem){
            max_elem = nums[i];
            }
            for (int j = i - 1;j >= 0;j--){
                temp = temp * nums[j]; 
                if (temp > max_elem){
                    max_elem = temp;
                }
            }
 
        }
        return max_elem;
        
    }
}