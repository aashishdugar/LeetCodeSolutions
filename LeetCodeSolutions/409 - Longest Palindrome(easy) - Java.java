class Solution {
    public int longestPalindrome(String s) {
        int[] chars = new int[256];
        for (char c : s.toCharArray()) {
            chars[c] ++;
        }
        
        int countOdd = 0;
        for (int i = 0; i < 256; i++) {
            if (chars[i] % 2 != 0) countOdd++;
        }
        
        return countOdd > 0 ? s.length() - countOdd + 1 : s.length();
    }
}
    /* Alternate Easy to Understand Solution using Maps
    public int longestPalindrome(String s) {
        Map<String,Integer> temp = new HashMap<String,Integer>();
        int count = 0;
        boolean midVal = false;
        for(int i = 1;i<= s.length();i++){
            if(temp.containsKey(s.substring(i-1,i))){
                int x = temp.get(s.substring(i-1,i));
                x++;
                temp.put(s.substring(i-1,i),x);                
            }
            else temp.put(s.substring(i-1,i),1);
        }
        for(Integer x: temp.values()){
            if(x%2 == 0) count = count + x;
            else 
            {   
                count = count + (x-1);
                midVal = true;
            }
        }
        if (midVal == true) return count + 1;
        return count;
    }
    */