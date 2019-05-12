class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        for(int i = 0; i< nums.length; i++){
            int currI = Math.abs(nums[i])-1;
            if(nums[currI] > 0){
                nums[currI] = -nums[currI];
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                res.add(i+1);
            }
        }
        return res;
    }
}