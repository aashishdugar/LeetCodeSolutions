class Solution {
    public boolean isHappy(int n) {
        if (n == 1){
            return true;
        }
        
        while(n != 1){
            int sum = 0;
            while(n > 0){
                int p = n%10;
                sum = sum + p*p;
                n = n/10;       
            }
            if (sum == 1){
                return true;
            }
            if (sum == 4){
                return false; //special condition
            }
            else{
                n = sum;
                continue;
            }
            
        }
        return false;
        
    }
}