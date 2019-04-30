class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int vals = 0;
        String res = "";
        String[] para = paragraph.replaceAll("[,.\\-!?;']", " ").toLowerCase().trim().split("\\s+");
        Map<String,Integer> m1 = new HashMap<String,Integer>();
        for(String x:para){
            if (m1.containsKey(x))
            {
                int val = m1.get(x);
                val += 1;
                m1.put(x,val);
            }
            else
            {
                m1.put(x,1);
            }
        }
        for(String y:banned){
            if (m1.containsKey(y)){
                m1.remove(y);
            }
        }
        for (Map.Entry<String, Integer> entry : m1.entrySet()) {
        String key = entry.getKey();
        int value = entry.getValue();
        if (value>vals){
            vals = value;
            res = key;
        }
        }
        return res;
        
        
    }
}
