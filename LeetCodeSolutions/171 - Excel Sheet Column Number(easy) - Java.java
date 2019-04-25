class Solution {
    public int titleToNumber(String s) {
        int tot = 0;
        int mult = 1;
        
        for(int i = s.length()-1 ; i >=0 ; i--){
            
            tot =  tot + (mult) * (s.charAt(i) - 64);
            mult = mult * 26;
        }
        
        
        return tot;
    }
}