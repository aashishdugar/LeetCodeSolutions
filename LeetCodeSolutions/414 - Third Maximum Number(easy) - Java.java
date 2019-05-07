class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> temp = new HashSet<Integer>();
        for(int x:nums){
            temp.add(x);
        }
        List<Integer> sorted_Temp = new ArrayList<Integer>(temp);
        Collections.sort(sorted_Temp);
        if (sorted_Temp.size() < 3) return(sorted_Temp.get(sorted_Temp.size() - 1));
        
        return (sorted_Temp.get(sorted_Temp.size() - 3));
        
    }
}