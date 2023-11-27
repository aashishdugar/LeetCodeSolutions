class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        getCombinations(0,candidates,target, new ArrayList<Integer>());

        return res;
        
    }

    public void getCombinations(int ind, int[] candidates, int target, ArrayList<Integer> temp){
        if(target == 0){
            Collections.sort(temp);
            if(!res.contains(temp)) res.add(new ArrayList<>(temp));
            return;
        }
    
        for(int i=ind;i<candidates.length;i++){
            if(candidates[i] <= target){
                temp.add(candidates[i]);
                getCombinations(i,candidates,target-candidates[i], temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}