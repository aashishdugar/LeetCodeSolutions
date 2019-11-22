class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> res = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(res.containsKey(nums[i])) {
                int temp = res.get(nums[i]);
                temp++;
                res.put(nums[i],temp);
            }
            else {
                res.put(nums[i],1);
            }
            
            if(res.get(nums[i]) > (Math.ceil((nums.length)/2))){
                return nums[i];
            }
        }
        return 1;
    }











