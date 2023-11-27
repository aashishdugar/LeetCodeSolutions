class Solution {
    public int jump(int[] nums) {
        int[] jumpsMem = new int[nums.length];
        Arrays.fill(jumpsMem, Integer.MAX_VALUE);
        jumpsMem[0] = 0;
        for(int i=0; i<nums.length;i++){
            for(int j = i; j <= i + nums[i] && j < nums.length; j++){
                jumpsMem[j] = Math.min(jumpsMem[j], jumpsMem[i]+1);
            }
        }

        return jumpsMem[nums.length - 1];
    }

}