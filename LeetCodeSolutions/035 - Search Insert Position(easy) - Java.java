class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(int x:nums){
            if (x >= target) return i;
            else i++;
        }
        return i;
    }
}