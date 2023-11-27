class Solution {
    public Map<Character,String> digitCombinations = new HashMap<>();
    public List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

        if(digits.length() == 0 || digits == null) return result;
        digitCombinations.put('2',"abc");
        digitCombinations.put('3',"def");
        digitCombinations.put('4',"ghi");
        digitCombinations.put('5',"jkl");
        digitCombinations.put('6',"mno");
        digitCombinations.put('7',"pqrs");
        digitCombinations.put('8',"tuv");
        digitCombinations.put('9',"wxyz");

        generateCombos(digits, 0, "");

        return result;
        
    }

    public void generateCombos(String digits, int digitIndex, String s){
        if(digitIndex == digits.length()){
            result.add(s);
            return;
        }

        char digit = digits.charAt(digitIndex);
        String current = digitCombinations.get(digit);
        for(int i = 0; i < current.length(); i++){
            s += Character.toString(current.charAt(i));
            generateCombos(digits,digitIndex+1, s);
            s = s.substring(0, s.length()-1);
        }
            
    }    
}