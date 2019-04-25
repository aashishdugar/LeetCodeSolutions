class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            Integer idx = map.put(nums[i], i);
            if(idx != null && idx != i && Math.abs(idx-i) <= k)
                return true;
    }
    return false;
        
    }
}