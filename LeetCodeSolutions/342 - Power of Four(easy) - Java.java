class Solution {
    public boolean isPowerOfFour(int num) {
        double d = Math.log(num)/Math.log(4);
        return d == (int) d;
        
    }
}