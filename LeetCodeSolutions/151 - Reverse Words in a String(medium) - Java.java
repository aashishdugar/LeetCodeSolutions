class Solution {
    public String reverseWords(String s) {
        ArrayList<String> res = new ArrayList<String>();
        String[] words = s.trim().split(" ");
        for (String x: words){
            if (x == null || x.trim().isEmpty()){
                continue;
            }
            else{
                x = x.trim().replaceAll("\\s+","");
                res.add(x);
            }
        }
        Collections.reverse(res);
        String r = String.join(" ",res);
        return r;
    }
}