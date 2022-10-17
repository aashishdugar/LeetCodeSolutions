class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,LinkedList<Integer>> indx = new TreeMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < groupSizes.length; i++){
            if(indx.containsKey(groupSizes[i])){
                LinkedList<Integer> temp = indx.get(groupSizes[i]);
                temp.add(i);
                for(int j: temp){
                }
            }
            else {
                LinkedList<Integer> temp = new LinkedList<>();
                temp.add(i);
                indx.put(groupSizes[i],temp);
            }
        }

        for(Map.Entry<Integer,LinkedList<Integer>> x: indx.entrySet()){
           int k = x.getKey();
           LinkedList<Integer> v = x.getValue();
           while(v.size() > 0){
            LinkedList<Integer> temp = new LinkedList<>();
            while(temp.size() < k){
                temp.add(v.pop());
            }
            res.add(temp);
            for(int y : temp){
            }
           }
        }
        return res;
    }
}