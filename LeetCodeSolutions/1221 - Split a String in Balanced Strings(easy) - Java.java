class Solution {
    public int balancedStringSplit(String s) {
        int ctr = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.substring(i,i+1).equals("R")){
                ctr++;
                }
            else{
                ctr--;
            }
            if(ctr == 0){
                res++;
            }
        }
        return res;
    }
}