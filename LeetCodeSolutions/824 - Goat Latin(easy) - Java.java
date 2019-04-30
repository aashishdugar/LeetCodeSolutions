class Solution {
    public String toGoatLatin(String S) {
        String[] s = S.trim().split(" ");
        String a = "a";
        String res = "";
        for(String x:s){
            if (x.substring(0,1).matches("[aAeEiIuUoO]")){
                x = x+"ma";
            }
            else{
                x = x.substring(1) + x.substring(0,1) + "ma";
            }
            x = x + a;
            a = a + "a";
            res = res + x + " ";
        }
        return res.trim();
    }
}