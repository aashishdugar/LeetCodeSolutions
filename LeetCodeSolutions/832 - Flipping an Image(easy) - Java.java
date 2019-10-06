class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i = 0;i<A.length;i++){
            A[i] = reverse(A[i]);
            A[i] = flip(A[i]);
        }
        
        return A;
        
    }
    
    private int[] flip(int arr[]){
        int beg = 0;
        int end = arr.length - 1;
        int temp;
        while (beg < end){
            temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            beg++;
            end--;
        }
        return arr;
    }
    
    private int[] reverse(int arr[]){
        for(int i = 0; i<arr.length;i++){
            arr[i] = arr[i] == 1 ? 0:1;
        }
        return arr;
        
    }
}