class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int kVal = -1;
        int minVal = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > minVal) {
                kVal = i;
                minVal = arr[i];
            }
        }
        
        if(kVal == 0 || kVal == arr.length - 1) return false;
    
        System.out.println(kVal);
        
        //increasing
        for(int i = 1; i <= kVal; i++){
            if(arr[i] <= arr[i-1]) return false;
        }
        
        //decreasing
        for(int i = kVal + 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]) return false;
        }
        
        return true;
        
    }
}