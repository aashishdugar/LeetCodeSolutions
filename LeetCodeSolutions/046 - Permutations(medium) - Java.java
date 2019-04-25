class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] visited = new int[nums.length];
        helper(nums, ans, new ArrayList<>(), visited);
        return ans;
    }
    public void helper(int[] nums, List<List<Integer>> ans, List<Integer> list, int[] visited){
        if(list.size() ==  nums.length){
            ans.add(new ArrayList<>(list));
        }
        for(int i = 0; i< nums.length;i++){
            if(visited[i] ==0){
                list.add(nums[i]);
                visited[i]=1;
                helper(nums, ans, list, visited);
                visited[i]=0;
                list.remove(list.size()-1);
            }
        }
        
    }
}
        return a.next