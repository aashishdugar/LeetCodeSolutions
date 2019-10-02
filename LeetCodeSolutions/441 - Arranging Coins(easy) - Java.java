class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        int counter = 1;
        while (n > 0 && n >= counter){
            n = n - counter;
            rows++;
            counter++;
            if (counter == n) return rows + 1;
            
        }
        return rows;
        
    }
}