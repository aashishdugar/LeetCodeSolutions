class Solution {
    public int maxSize = -1;
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] answer = new int[queries.length];
        Arrays.sort(nums);
        for(int i = 0; i < queries.length; i++){
            int sum = 0, ctr = 0;
            for(int j = 0; j < nums.length; j++){
                if(sum + nums[j] <= queries[i]){
                    sum += nums[j];
                    ctr++;
                }
            }
            answer[i] = ctr;
        } 
        return answer;
    }
}