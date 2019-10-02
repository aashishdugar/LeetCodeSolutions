class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr.length == 1)  return true;
        Map<Integer,Integer> res = new HashMap<>();
        for(Integer x:arr){
            if (res.containsKey(x)){
                int val = res.get(x);
                res.put(x,val+1);
            }
            else res.put(x,1);
        }
        Set<Integer> res2 = new HashSet<>(res.values());
        return res2.size() == res.size();
        
    }
}