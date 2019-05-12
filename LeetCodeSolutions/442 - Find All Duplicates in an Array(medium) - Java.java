class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] count = new int[nums.length + 1];
        List<Integer> results = new ArrayList<>();
                
        for(int num:nums) {
            if(count[num] > 0) {
                results.add(num);
            }
            count[num]++;
        }
        
        return results;
            
    }
}