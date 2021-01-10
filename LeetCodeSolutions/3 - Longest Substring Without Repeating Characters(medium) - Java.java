class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length()) {
            char c = s.charAt(right);
            if(!set.add(c)) {
                while(s.charAt(left) != c) {
                    set.remove(s.charAt(left++));
                }
                left++;
            }
            
            max = Math.max(max,set.size());
            right++;
        }
        
        return max;
    }
}