class Solution {
    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        Stack<Character> temp = new Stack<>();
        
        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);
            if(c == 'G') res.append(c);
            else if(c == ')') {
                temp.push(c);
                if(temp.size() == 2) {
                    res.append('o');
                    temp.clear();
                }
                else if(temp.size() == 4) {
                    res.append("al");
                    temp.clear();
            }
        }
            else temp.push(c);
        
    }
        
        return res.toString();
}
}