class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> res = new HashSet<>();
            
        for(String a:words){
            String wrd = "";
            for(int i = 0;i<a.length();i++){
               int val = (int) a.charAt(i) - 97;
               wrd = wrd + morse[val];
            }
            res.add(wrd);
        }
    
        return res.size();
    }
}