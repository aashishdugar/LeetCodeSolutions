class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        Given i and y that points to the start of the array,
        we move the pointers through the array as the till we find the 2 numbers
        that when added, give us the required sum.
        
        Args:
        i,j - points to the front of the array
        
        Returns:
        vals - array that contains the indices.
        */
        int[] vals = new int[2];
        for(int i = 0; i<nums.length-1;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    vals[0] = i;
                    vals[1] = j;
                }
            }
        }
        return vals;
    }   
}