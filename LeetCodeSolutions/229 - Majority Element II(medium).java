class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> counter = new HashMap<>();
        int ratio = nums.length/3;
        
        for(int x: nums) {
            if(counter.containsKey(x)) {
                int temp = counter.get(x);
                counter.put(x,temp+1);
            }
            else counter.put(x,1);
        }
        
        for (Map.Entry<Integer,Integer> x: counter.entrySet()){
            if (x.getValue() > ratio) res.add(x.getKey());
        }
        
        return res;
        
        
    }
}