class Solution {
    public int repeatedNTimes(int[] A) {
        int x =0;
        Map<Integer,Integer> res = new HashMap<>();
        for(Integer a:A){
            if(res.containsKey(a)){
                int val = res.get(a);
                res.put(a,++val);
            }
            else res.put(a,1);
        }
        for(Map.Entry<Integer,Integer> entry : res.entrySet()){
            if (entry.getValue() == A.length/2) {
                x = entry.getKey();
                break;
            }
        }
        return x;
    }
}
