class Solution {
    public boolean isValid(String s) {
        Stack<Character> opens = new Stack<>();
        char temp;
        
        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') opens.push(s.charAt(i));
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                    if (opens.empty()) return false;
                    temp = opens.pop();
                    if ((temp == '{' && s.charAt(i) == '}') || (temp == '[' && s.charAt(i) == ']') || (temp == '(' && s.charAt(i) == ')')) {
                        continue;
                    }
                    else return false;      
            }
        }
        if (!(opens.empty())) return false;
        return true;
    }
    
}
