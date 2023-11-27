class Solution {
    public List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        generateSum(0, candidates, target, new ArrayList<Integer>());

        return res;
    }

    public void generateSum(int ind, int[] candidates, int target, ArrayList<Integer> temp){
        if(target == 0){
            Collections.sort(temp);
            if(!res.contains(temp))res.add(new ArrayList<Integer>(temp));
            return;
        }

        for(int i = ind; i < candidates.length; i++){
            if(i!=ind && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            temp.add(candidates[i]);
            generateSum(i+1, candidates, target - candidates[i], temp);
            temp.remove(temp.size() - 1);
        }
    }
}