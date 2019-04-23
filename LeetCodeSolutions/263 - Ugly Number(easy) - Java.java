class Solution {
    public boolean isUgly(int num) {
        if (num ==0){
            return false;
        }
        while(num != 1){
            if(num%2 == 0){
                num = num/2;
                if (num == 1) return true;
                continue;
            }
            if(num%3 == 0){
                num = num/3;
                if (num == 1) return true;
                continue;
            }
            if(num%5 == 0){
                num = num/5;
                if (num == 1) return true;
                continue;
            }
            else{
                return false;
            }
            
        }
        return true; 
    }
}