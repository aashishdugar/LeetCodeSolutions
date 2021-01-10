class Solution {
    public boolean increasingTriplet(int[] arr) {
        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        for(int x : arr) {
            if(x <= minA) minA = x;
            else if (x <= minB) minB = x;
            else return true;
        }
        
        return false;
    }
}