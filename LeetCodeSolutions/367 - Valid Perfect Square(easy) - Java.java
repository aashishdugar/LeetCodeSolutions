class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 2147483647) return false;
        return check(num, 1);
        
        }
    
    public boolean check(int num,int n){
            if (n*n == num) return true;
            else if (n*n < num) return check(num,++n);
            else return false;   
        
    }
}