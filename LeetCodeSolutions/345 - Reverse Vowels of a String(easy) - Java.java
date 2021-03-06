class Solution {
    public String reverseVowels(String s) {
         int i = -1;
        int j = s.length();

        char[] chs = s.toCharArray();
        while (i < j) {
            while ( ++ i < j && !isVowel(chs[i]));

            while (i < --j && !isVowel(chs[j]));

            // swap
            if (i < j) {
                char tmp = chs[i];
                chs[i] = chs[j];
                chs[j] = tmp;
            }
        }

        return String.valueOf(chs);
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
        
}
